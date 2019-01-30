package TaskMultipleFrame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Swing.EventHandler;
import Swing.TestHello;

public class Swings 
{
	JFrame frame =null;
	Swings()
	{
		frame = new JFrame("Operators");
		//frame.setSize(width,height); //width by height
		//frame.setLayout(null); //uses no layout managers ( not needed for now)
		//frame.getContentPane().setBackground(Color.RED);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //like scanner.close()
		run();
		//frame.setVisible(true);
	}
	
	private void run()
	{

		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		GridLayout gridLayout = new GridLayout(4,1);
		b1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Create("additive");
				//t3.setText(add(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b2.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Create("subtract");
				//t3.setText(sub(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b3.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Create("multiply");
				//t3.setText(multiply(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		
		b4.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Create("divide");
				//t3.setText(div(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});	
		frame.setLayout(gridLayout);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);		
		frame.setSize(500,500); //width by height
		frame.setVisible(true);
	}
	
	
	public void Create(String windowName)
	{
		JFrame frameFun = new JFrame(windowName);
		
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
		Button b1 = new Button(windowName.substring(0, 3));
		b1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				t3.setText(calculate(windowName,Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});		
		frameFun.setLayout(gridLayout);
		frameFun.add(l1);
		frameFun.add(t1);
		frameFun.add(l2);
		frameFun.add(t2);
		frameFun.add(l3);
		frameFun.add(b1);
		frameFun.add(l4);
		frameFun.add(t3);
		frameFun.setSize(500,500); //width by height
		frameFun.setVisible(true);
		
	}
	private String calculate(String operator,int num1,int num2)
	{
		switch(operator)
		{
			case "additive": 
				return additive(num1,num2);
			case "subtract":
				return sub(num1,num2);
			case "multiply": 
				return multiply(num1,num2);
			case "divide":
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
}
