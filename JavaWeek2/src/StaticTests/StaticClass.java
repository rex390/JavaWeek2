package StaticTests;

public class StaticClass 
{
	static int counter=0;
	static int amount=0;
	int nonStaticCounter=0;
	StaticClass()
	{
		counter++;
	}
	static 
	{
		amount=100;
		//System.out.println(amount);
	}
	
	public void show()
	{
		System.out.println("amount is " + amount);
	}
	
	
	public void nonStaticMethodWithStatic()
	{
		System.out.println("non-static method shows that the static counter is : " + counter);
	}
	
	public static void staticMethodWithStatic()
	{
		System.out.println("static method shows that the static counter is : " + counter);
	}
	
	public static void staticMethodWithNonStatic() //will not work
	{
		//System.out.println("static method shows that the non-static counter is : " + nonStaticCounter); 
		/*
		 	this is never going to work because it is a static method with a non static variable 
		 */
	}
}
