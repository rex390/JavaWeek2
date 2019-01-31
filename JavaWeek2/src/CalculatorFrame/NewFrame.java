package CalculatorFrame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class NewFrame extends JFrame
{

	
	NewFrame(String windowName)
	{
		Create(windowName);
	}
	public void Create(String windowName)
	{
		setTitle(windowName);		
		GridLayout gridLayout = new GridLayout(4,2);
		//frameFun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //like scanner.close()
		TextField t1,t2,t3;
		Label l1,l2,l3,l4;
		l1 = new Label("First:");
		l2 = new Label("Second:");
		l3 = new Label("");
		l4 = new Label("Result:");
		t1 = new TextField("1");
		t2 = new TextField("1");
		t3 = new TextField();
		Button b1 = new Button(changeButton());
		b1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(calculate(windowName,Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});		
		setLayout(gridLayout);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(b1);
		add(l4);
		add(t3);
		setSize(500,500); //width by height
		setVisible(true);
		
	}
	private String calculate(String operator,int num1,int num2)
	{
		switch(operator)
		{
			case "addition": 
				return additive(num1,num2);
			case "subtraction":
				return sub(num1,num2);
			case "multiplication": 
				return multiply(num1,num2);
			case "division":
				return div(num1,num2);
				
		}
		return "";
		
	}
	
	private String additive(int num1,int num2)
	{
		return "" + (num1+num2);
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
	
	public String changeButton()
	{

		switch(getTitle())
		{
		case "addition": 
			return "+";
		case "subtraction":
			return "-";
		case "multiplication": 
			return "*";
		case "division":
			return "/";
		}
		return "error";
	}
}
