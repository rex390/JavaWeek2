package PrivateMethod;

public class ClassOne 
{
	private int privateVar=0;
	protected int protectedVar=0;
	public int publicVar=0;
	
	
	public void displayAllButPrivate()
	{		
		System.out.println("public variable is " + publicVar );
		System.out.println("protected variable is " + protectedVar );
	}
	
	public void displayAll()
	{		
		System.out.println("private variable is " + privateVar );
		System.out.println("public variable is " + publicVar );
		System.out.println("protected variable is " + protectedVar );
	}
}
