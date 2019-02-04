package CalculatorFrame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InitialFrame extends JFrame 
{
	InitialFrame(String windowName)
	{
		run(windowName);
	}
	
	private void run(String windowName)
	{

		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		GridLayout gridLayout = new GridLayout(4,1);
		b1.addActionListener(e -> createNewFrameWithTitle("addition"));
		b1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				NewFrame newFrame = new NewFrame("addition");
				//t3.setText(add(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b2.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				NewFrame newFrame = new NewFrame("subtraction");
				//t3.setText(sub(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		b3.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				NewFrame newFrame = new NewFrame("multiplication");
				//t3.setText(multiply(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});
		
		b4.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				NewFrame newFrame = new NewFrame("division");
				//t3.setText(div(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText())));
			}
			
		});	
		setLayout(gridLayout);
		add(b1);
		add(b2);
		add(b3);
		add(b4);		
		setTitle(windowName);
		setSize(500,500); //width by height
		setVisible(true);
	}
	
	public static void createNewFrameWithTitle(String title) {
		NewFrame newFrame = new NewFrame(title);
	}
	
	
	
	
}
