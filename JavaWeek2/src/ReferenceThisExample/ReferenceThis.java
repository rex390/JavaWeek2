package ReferenceThisExample;

public class ReferenceThis 
{
	int x =10;
	
	public void one()
	{
		int x ;
		x = 15;
		System.out.println("the local variable is x: " + ++x + " and the variable x of the current class is " + this.x);
	}
	
	public void showCurrentObjectX()
	{
		System.out.println("the value of variable x of this current object is " + this.x);
	}
}
