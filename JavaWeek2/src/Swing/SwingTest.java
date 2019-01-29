package Swing;
import java.awt.Color;

import javax.swing.*;
public class SwingTest 
{
	JFrame frame = null;
	public void runTest(int width,int height,String windowName)
	{
		createFrame(width,height,windowName);
	}
	private void createFrame(int width,int height,String windowName)
	{
		frame = new JFrame(windowName);
		frame.setSize(width,height); //width by height
		frame.setLayout(null); //uses no layout managers ( not needed for now)
		frame.getContentPane().setBackground(Color.RED);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //like scanner.close()
		frame.setVisible(true);
	}
	
	public void createButton(String textInButton,int xPos,int yPos,int width,int height)
	{
		JButton button = new JButton(textInButton);//creating instance of JButton  
		button.setBounds(xPos,yPos,width, height);//x axis, y axis, width, height 
		button.addActionListener(e->clickButton());
		frame.add(button);
		
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