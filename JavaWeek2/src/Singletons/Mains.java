package Singletons;

public class Mains {

	public static void main(String[] args) 
	{
		Singletons a = null,b =null,c =null;
		a = a.createSingletons();
		a.setX(10);
		b = b.createSingletons();
		System.out.println("a has changed the x value to 10 and b displays this as " + b.getX());
		b.setY(20);
		c = c.createSingletons();
		System.out.println("b has changed the y value to 20 and c displays this as " + c.getX());
		

	}

}
