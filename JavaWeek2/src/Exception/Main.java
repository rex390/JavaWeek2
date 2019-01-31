package Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int c=0;
		try 
		{
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			c=4/i;
			System.out.println("it was fine");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught");
		}
		catch(Exception e)
		{
			System.out.println("the exception caught");
		}

	}

}
