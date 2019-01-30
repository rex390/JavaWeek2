package Swing;

import java.awt.event.KeyEvent;

import javax.swing.JButton;

public abstract class TestButton extends JButton implements AbstractResponse
{
	KeyEvent[] keys;
	
	TestButton(String defaultButtonText)
	{
		this.setText(defaultButtonText);
		keys = new KeyEvent[1];
		addActionListener(e->runResponse());
	}
	
	TestButton(String defaultButtonText, KeyEvent... args)
	{
		this.setText(defaultButtonText);
		addActionListener(e->runResponse());
		
		keys = new KeyEvent [args.length];
		int u = 0;
		for(KeyEvent i: args)
		{
			keys[u] = i;
			u++;
		}
	}
	
	public abstract void runResponse();
}
