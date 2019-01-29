package Singletons;

public class Singletons 
{
	static Singletons singleObject;
	private Singletons() {};
	private int x,y;
	
	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public static Singletons createSingletons()
	{
		if(singleObject==null)
		{
			singleObject = new Singletons();
		}
		return singleObject;
	}
}
