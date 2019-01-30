package Swing;

import java.awt.event.KeyEvent;

public class TestHello extends TestButton
{
	TestHello(String defaultButtonText) 
	{
		super(defaultButtonText);

	}
	TestHello(String defaultButtonText, KeyEvent one) 
	{
		super(defaultButtonText,one);

	}

	@Override
	public void runResponse() 
	{
		
		for(KeyEvent i: keys)
		{
			if(i!=null)
			{
				if(i.getKeyCode() == KeyEvent.VK_SPACE)
				{
					System.out.println("space is pressed");
				}
			}
		}		
	}
}
