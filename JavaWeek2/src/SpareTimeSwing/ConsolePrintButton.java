package SpareTimeSwing;

import java.awt.event.KeyEvent;

public class ConsolePrintButton extends TestButton
{
	String message ="";
	ConsolePrintButton(String defaultButtonText,String message) 
	{
		super(defaultButtonText);
		this.message = message;

	}
	@Override
	public void runResponse() 
	{
		System.out.println(message);						
	}
}