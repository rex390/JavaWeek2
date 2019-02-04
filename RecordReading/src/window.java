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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class window extends JFrame
{
	List<DatabaseFormat> save = new ArrayList<DatabaseFormat>();
	ResultSet rec;
	Connection conn;
	Statement stmt = null;
	window(String windowName)
	{
		run(windowName);
	}
	
	private void run(String windowName)
	{
		initDatabase();
		setupFrame(windowName);
	}
	
	public void setupFrame(String windowName)
	{
		Panel panelInfo = new Panel();
		Panel panelNext = new Panel();
		Panel EOFMessage = new Panel();
		
		Label labelResult,labelName,labelMarks,labelResultValue,labelNameValue,labelMarksValue;
		TextField resultTextField,nameTextField,marksTextField;
		
		resultTextField= new TextField();
		nameTextField= new TextField();
		marksTextField= new TextField();
		
		labelResult = new Label("Reg");
		labelName = new Label("Name");
		labelMarks = new Label("Marks");
		labelResultValue = new Label();
		labelNameValue = new Label();
		labelMarksValue = new Label();
		
		Label EOFLabel = new Label("Beginning of file");
		EOFMessage.add(EOFLabel);
		
		GridLayout gridLayout = new GridLayout(3,3);
		panelInfo.setLayout(gridLayout);	
		panelInfo.add(labelResult);
		panelInfo.add(labelResultValue);
		panelInfo.add(labelName);
		panelInfo.add(labelNameValue);	
		panelInfo.add(labelMarks);
		panelInfo.add(labelMarksValue);
		Button nextButton = new Button("Next");
		Button restart = new Button("Restart");
		nextButton.addActionListener(e->buttonPressed(labelResultValue,labelNameValue,labelMarksValue,EOFLabel));
		restart.addActionListener(e->restartPressed(labelResultValue,labelNameValue,labelMarksValue,EOFLabel));
		panelNext.add(nextButton);
		panelNext.add(restart);
		add(EOFMessage,BorderLayout.NORTH);
		add(panelNext,BorderLayout.SOUTH);
		add(panelInfo,BorderLayout.CENTER);		
		setTitle(windowName);
		setSize(500,500); //width by height
		setVisible(true);
	}
	private void restartPressed(Label regLabel,Label nameLabel,Label markLabel,Label EOFLabel)
	{
		try 
		{
			rec.beforeFirst();
			buttonPressed(regLabel,nameLabel,markLabel,EOFLabel);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void buttonPressed(Label regLabel,Label nameLabel,Label markLabel,Label EOFLabel)
	{
		try 
		{
			if(rec.next())
			{
				regLabel.setText(Integer.toString(rec.getInt(1)));
				nameLabel.setText(rec.getString(2));
				markLabel.setText(Integer.toString(rec.getInt(3)));
				EOFLabel.setText("");
				
			}
			else
			{
				regLabel.setText("");
				nameLabel.setText("");
				markLabel.setText("");
				EOFLabel.setText("End of file");
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		readDatabase();
	}
	
	private void readDatabase()
	{
		save.clear();
		try 
		{
			rec = stmt.executeQuery("Select * from school");
			while(rec.next())
			{
				save.add(new DatabaseFormat(rec.getInt(1), rec.getString(2), rec.getInt(3)));
			}
			rec.beforeFirst();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
