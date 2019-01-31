package Swing;

import java.awt.event.KeyEvent;

public class TestHello extends TestButton
{
	String message="";
	TestHello(String defaultButtonText,String message) 
	{
		super(defaultButtonText);
		this.message = message;

	}
	TestHello(String defaultButtonText, KeyEvent one) 
	{
		super(defaultButtonText,one);

	}

	@Override
	public void runResponse() 
	{

			System.out.println(message);

			
				
	}
}
