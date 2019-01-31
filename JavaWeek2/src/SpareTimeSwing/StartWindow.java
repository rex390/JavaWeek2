package SpareTimeSwing;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class StartWindow extends GUI
{

	StartWindow(String windowName, int width, int height) 
	{
		super(windowName, width, height);
	}

	@Override
	protected void windowBuild() 
	{
		ConsolePrintButton b1 = new ConsolePrintButton("hello","hello");
		add(b1);
		ConsolePrintButton b2 = new ConsolePrintButton("bye","bye");
		add(b2);
	}

	@Override
	protected void windowLayout() 
	{
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //like scanner.close()
		
	}
	
}
