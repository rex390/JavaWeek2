package PrivateMethod;

public class ClassTwo extends ClassOne
{
	public void classTwoAccessPrivate() //not possible since you can't access private variables in a child class
	{
		//System.out.println("private variable is " + privateVar );
	}
}
