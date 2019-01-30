package Swing;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class SwingTest 
{
	JFrame frame = null;
	public void runTest(int width,int height,String windowName)
	{
		createFrame(width,height,windowName);
	}
	private void createFrame(int width,int height,String windowName) //commented out functionality to be worked on
	{
		frame = new JFrame(windowName);
		//frame.setSize(width,height); //width by height
		//frame.setLayout(null); //uses no layout managers ( not needed for now)
		//frame.getContentPane().setBackground(Color.RED);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //like scanner.close()
		//frame.setVisible(true);
	}
	
	public void createButton(String textInButton,int xPos,int yPos,int width,int height)
	{
		JButton button = new JButton(textInButton);//creating instance of JButton  
		button.setBounds(xPos,yPos,width, height);//x axis, y axis, width, height 
		button.addActionListener(e->clickButton());
		frame.add(button);
		
			
	}
	public void createButtonLayout(String textInButton,String layout, AbstractResponse abstractHandler)
	{
		//EventHandler e = new EventHandler(abstractHandler);
		Button button = new Button(textInButton);//creating instance of JButton  
		//button.addActionListener(e);
		frame.add(button,layout);					
	}
	
	public void createTest()
	{
		//TestButton tester = new TestButton();
	}
	public void ExampleFlow()
	{
		TextField t1,t2,t3;
		Label l1 = new Label("+");
		t1 = new TextField("10");
		t2 = new TextField("10");
		t3 = new TextField("");
		Button b1 = new Button("=");
		EventHandler e = new EventHandler(t1,t2,t3);
		FlowLayout flowLayout = new FlowLayout();
		b1.addActionListener(e);
		TestHello helloButton = new TestHello("hello button");
		frame.setLayout(flowLayout);
		frame.add(t1);
		frame.add(l1);
		frame.add(t2);
		frame.add(b1);
		frame.add(t3);
		frame.add(helloButton);
	}
	public void Exampleanonymous()
	{
		TextField t1,t2,t3;
		Label l1 = new Label("+");
		t1 = new TextField("2");
		t2 = new TextField("1");
		t3 = new TextField("");
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		EventHandler e = new EventHandler(t1,t2,t3);
		FlowLayout flowLayout = new FlowLayout();
		b1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(add(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b2.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(sub(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b3.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(multiply(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		
		b4.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(div(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		
		TestHello helloButton = new TestHello("hello button");
		frame.setLayout(flowLayout);
		frame.add(t1);
		frame.add(t2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(t3);
		frame.add(helloButton);
	}
	
	public String add(int num1,int num2)
	{
		return ""+(num1+num2);
	}
	public String sub(int num1,int num2)
	{
		return "" + (num1-num2);
	}
	public String div(int num1,int num2)
	{
		return ""+ (num1/num2);
	}
	public String multiply(int num1,int num2)
	{
		return "" +num1*num2;
	}
	public void recreateFrame(int width,int height)
	{
		frame.setSize(width,height); //width by height
		frame.setVisible(true);
	}
	public void clickButton()
	{
		System.out.println("clicked yay");
	}
	public JFrame getFrame()
	{
		return frame;
	}
	
	public void addTextField(String text,int xPos,int yPos,int width,int height)
	{
		 JTextField textField=new JTextField();  
		 textField.setBounds(xPos,yPos,width, height);
		 textField.setText(text);
		 textField.setBackground(Color.black);
		 textField.setForeground(Color.RED); //changes text color
		 textField.setVisible(true);
		 //textField.
		 frame.add(textField);
		 textField.requestFocus();
		// textField.revalidate();
		 //textField.repaint();	 
	}
	
}
