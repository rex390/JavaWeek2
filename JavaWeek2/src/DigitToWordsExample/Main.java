package DigitToWordsExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Conversion convert = new Conversion();
		int integer=1;
		
		StringConversion convertString = new StringConversion();
		IfConversion convertIf = new IfConversion();
		if(sc.hasNext())
		{
			if(sc.hasNextInt())
			{
				integer = sc.nextInt();
				//convert.DigitToWords(sc.nextLine()); //my method
				//convertIf.digitToWord(sc.nextInt());
				convertString.digitToWord(integer);
			}
		}


	}

}
