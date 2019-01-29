package DigitToWordsExample;

public class IfConversion 
{
	public void digitToWord(int value)
	{
		String answer ="";
		if(value>=1000)
		{
			answer = ones(value/1000) + " thousand";
			value -= ((value/1000)*1000);
		}
		if(value>=100)
		{
			answer+= " " + ones(value/100) + " hundred";
			value-= ((value/100)*100);
		}
		if(value >=20)
		{
			System.out.println("tens is " +  value);
			answer += " " + tens((value/10)*10);
			value = value%10;
		}
		if(value>=1 & value <=19)
		{
			answer+= " " + ones(value);
		}
		System.out.println(answer);
	}
	
	public String ones(int value)
	{
		String word ="";
		switch(value)
		{
			case 1: word =  "one";
			break;
			case 2: word = "two" ;
			break;
			case 3: word =  "three";
			break;
			case 4: word =  "four";
			break;
			case 5: word = "five";
			break;
			case 6: word =  "six";
			break;
			case 7: word =  "seven";
			break;
			case 8: word = "eight";
			break;
			case 9: word = "nine";
			break;
			case 10: word =  "ten";
			break;
			case 11: word = "eleven" ;
			break;
			case 12: word =  "twelve";
			break;
			case 13: word =  "thirteen";
			break;
			case 14: word = "fourteen";
			break;
			case 15: word =  "fifteen";
			break;
			case 16: word =  "sixteen";
			break;
			case 17: word = "seventeen";
			break;
			case 18: word = "eighteen";
			break;
			case 19: word = "ninteen";
			break;
		}
		return word;
	}
	
	private String tens(int tenValue)
	{
		String word = "";

		switch (tenValue)
		{
			case 10: word +=  "ten";
			break;
			case 20: word += "twenty" ;
			break;
			case 30: word +=  "thirty";
			break;
			case 40: word +=  "fourty";
			break;
			case 50: word += "fifty";
			break;
			case 60: word +=  "sixty";
			break;
			case 70: word +=  "seventy";
			break;
			case 80: word += "eighty";
			break;
			case 90: word += "ninty";
			break;
		}
		return word;
	}
}
