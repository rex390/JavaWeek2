package ResultsWeek2Day1;
import java.util.Scanner;

public class InputClass 
{
	Scanner sc;
	InputClass()
	{
		sc = new Scanner(System.in);
	}
	public int stringToInteger(int minVal,int maxVal,int defaultValue,String message)
	{
		int parsedVal = defaultValue;
		boolean badInput = true;
		while(badInput)
		{
			try
			{
	
					System.out.println(message);
					parsedVal = Integer.parseInt(sc.nextLine());
					badInput = checkValue(parsedVal,minVal,maxVal);
				
			}
			catch(Exception e)
			{
				badInput = true;
				System.out.println("Invalid value");
		}
		}
		return parsedVal;
		
	}
	
	public boolean checkValue(int valueToCheck,int minVal,int maxValue)
	{
		
		if(valueToCheck>=0 & valueToCheck<=maxValue)
		{
			return false;
		}
		System.out.println("Value not within range");
		return true;
	}
	
	public void closeScanner()
	{
		sc.close();
	}
}
