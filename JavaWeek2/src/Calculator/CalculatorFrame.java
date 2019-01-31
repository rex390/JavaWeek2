package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame
{
	List<NumericButton> buttonList = new ArrayList<NumericButton>();
	public CalculatorFrame(String windowName,int width,int height) 
	{

		run(windowName,width,height);
		
		
	}
	public void run(String windowName,int width,int height)
	{
		setTitle(windowName);
		windowBuild();
		//windowLayout();
		setSize(width,height);
		setVisible(true);	
	}
	
	public void windowBuild()
	{
		Panel labelPanel = new Panel();
		Panel buttonPanel = new Panel();
		TextField labelCal = new TextField(30);
		labelCal.setText("");
		labelPanel.add(labelCal);
		labelPanel.setVisible(true);
		buttonPanel.setVisible(true);
		GridLayout gridLayout = new GridLayout(4,4);
		buttonPanel.setLayout(gridLayout);
		
		final int buttonAmount = 16;
		int padding = 0;
		for(int count = 0 ; count<buttonAmount;count++)
		{
			if((count!=0) && ((count+1)%4==0))
			{
				buttonList.add(new NumericButton("operator",labelCal));
				padding++;
			}
			else
			{
				buttonList.add(new NumericButton(""+ ( count - padding),labelCal));							
			}
		}
		finishButtonOperatorSetup();
		for(int count = 0 ; count<buttonList.size();count++)
		{
			buttonPanel.add(buttonList.get(count));				
		}

		add(labelPanel,BorderLayout.NORTH);
		add(buttonPanel,BorderLayout.CENTER);	
	}
	
	private void finishButtonOperatorSetup()
	{
		buttonList.get(13).setLabel("c");
		buttonList.get(13).setOperator(true);
		buttonList.get(14).setLabel("=");
		buttonList.get(14).setOperator(true);
		int count =0;
		for(NumericButton button: buttonList)
		{
			if(button.getLabel().equals("operator"))
			{
				button.setLabel(returnCorrectOperator(count));
				count++;
			}
		}
	}
	private String returnCorrectOperator(int operNum)
	{
		switch(operNum)
		{
			case 0: return "+";
			case 1: return "-";
			case 2: return "X";
			case 3: return "/";
		}
		return null;
	}
}
