import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class window extends JFrame
{
	
	Connection conn;
	Statement stmt = null;
	window(String windowName)
	{
		run(windowName);
	}
	
	private void run(String windowName)
	{
		initDatabase();
		Panel panelInfo = new Panel();
		Panel panelSave = new Panel();

		
		Label labelResult,labelName,labelMarks,labelResultError,labelNameError,labelMarksError;
		TextField resultTextField,nameTextField,marksTextField;
		
		resultTextField= new TextField();
		nameTextField= new TextField();
		marksTextField= new TextField();
		
		labelResult = new Label("Reg");
		labelName = new Label("Name");
		labelMarks = new Label("Marks");
		labelResultError = new Label();
		labelNameError = new Label();
		labelMarksError = new Label();
		
		Button saveButton = new Button("Save");
		
		saveButton.addActionListener(e->buttonPressed(resultTextField.getText(),labelResultError,nameTextField.getText(),labelNameError,marksTextField.getText(),labelMarksError));
		panelSave.add(saveButton);
		GridLayout gridLayout = new GridLayout(3,3);
		panelInfo.setLayout(gridLayout);
		
		panelInfo.add(labelResult);
		panelInfo.add(resultTextField);
		panelInfo.add(labelResultError);
		
		panelInfo.add(labelName);
		panelInfo.add(nameTextField);
		panelInfo.add(labelNameError);
		
		panelInfo.add(labelMarks);
		panelInfo.add(marksTextField);
		panelInfo.add(labelMarksError);
		
		add(panelSave,BorderLayout.SOUTH);
		add(panelInfo,BorderLayout.CENTER);		
		setTitle(windowName);
		setSize(500,500); //width by height
		setVisible(true);
	}
	
	private void buttonPressed(String resultTextField,Label resultMessage,String nameTextField,Label nameMessage,String markTextField,Label markMessage)
	{
		if(saveCheck(resultTextField,resultMessage,nameTextField,nameMessage,markTextField,markMessage))
		{
			insertDatabase(resultTextField,nameTextField,markTextField);
			System.out.println("inserted");
		}
		else
		{
			System.out.println("bad");
		}
	}
	private boolean saveCheck(String resultTextField,Label resultMessage,String nameTextField,Label nameMessage,String markTextField,Label markMessage)
	{		
		resultMessage.setText((checkIfNumber(resultTextField)==true) ? "" : "missing");
		nameMessage.setText((nameTextField.equals("")) ? "missing" : "");
		markMessage.setText((checkIfNumber(markTextField)==true) ? "" : "missing");
		
		return (resultMessage.getText().equals("missing") ||nameMessage.getText().equals("missing") || markMessage.getText().equals("missing")) ? false : true;
	}
	private boolean checkIfNumber(String markTextField)
	{
		try
		{
			Integer.parseInt(markTextField);
			return true;
		}
		catch(NumberFormatException e)
		{
	
			return false;
		}
	}
	
	private void  initDatabase()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/databasetest","root","");
			stmt = conn.createStatement();

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}		
	}
	
	private void insertDatabase(String reg,String name,String marks)
	{
		try 
		{
			stmt.executeUpdate("Insert into school values("+ reg+ ",'"+name+"',"+marks+")");
			readDatabase();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void readDatabase()
	{
		ResultSet rec;
		try 
		{
			rec = stmt.executeQuery("Select * from school");
			while(rec.next())
			{
				System.out.println("reg is " + rec.getInt(1));
				System.out.println("name is " +rec.getString(2));
				System.out.println("mark is " +rec.getInt(3));
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
