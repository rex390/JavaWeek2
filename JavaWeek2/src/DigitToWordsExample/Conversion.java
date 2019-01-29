package DigitToWordsExample;

public class Conversion 
{
	public void DigitToWords(String value)
	{
		String[] temp = value.split("");
		String word = "";		
		int thousands,hundreds,tens,units;
		int testUnit;
		if(temp.length==4)
		{
			thousands = Integer.parseInt(temp[0]);
			hundreds = Integer.parseInt(temp[1]);
			testUnit = Integer.parseInt((temp[2] + temp[3]));
			word += (unitsToStrings(thousands," thousand"));
			word += " " + (unitsToStrings(hundreds," hundred"));
			word += " " + digitTensAndUnits(testUnit,true);
		}
		else if(temp.length==3)
		{
			hundreds = Integer.parseInt(temp[0]);
			testUnit = Integer.parseInt((temp[1] + temp[2]));
			word +=(unitsToStrings(hundreds," hundred"));
			word += " " + digitTensAndUnits(testUnit,true);
		}
		else if(temp.length==2)
		{
			testUnit = Integer.parseInt((temp[0] + temp[1]));
			System.out.println(testUnit);
			word +=digitTensAndUnits(testUnit,false);
		}
		else if(temp.length==1)
		{
			word = unitsToStrings(Integer.parseInt(temp[0]),"");
		}
		System.out.println(word); 
	}
	
	private String unitsToStrings(int unitValue, String type)
	{
		String word = "";
		switch (unitValue)
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
		}
		if( word !="")
		{
			word+=type;
		}
		//word = (word + type);
		return word;
	}
	private String tens(int tenValue,boolean andControl)
	{
		String word = "";
		if(andControl)
		{
			word = "and "; 
		}
		switch (tenValue)
		{
			case 1: word +=  "ten";
			break;
			case 2: word += "twenty" ;
			break;
			case 3: word +=  "thirty";
			break;
			case 4: word +=  "fourty";
			break;
			case 5: word += "fifty";
			break;
			case 6: word +=  "sixty";
			break;
			case 7: word +=  "seventy";
			break;
			case 8: word += "eighty";
			break;
			case 9: word += "ninty";
			break;
		}
		if(word=="and ")
		{
			word ="";
		}
		return word;
	}
	
	private String digitTensAndUnits(int value,boolean andControl)
	{
		String word ="";
		if(value%10==0)
		{
			word = tens(value/10,andControl);
		}
		else
		{
			if(value>=11 & value <19)
			{
				word = specialValue(value);
			}
			else
			{
				word  = tens(value/10,andControl) + " " + unitsToStrings(value%10,"");
			}
			//word = " something else";
		}	
		return word;
	}
	private String specialValue(int specialValue)
	{
		String word = "and ";
		switch (specialValue)
		{
			case 11: word +=  "eleven";
			break;
			case 12: word += "twelve" ;
			break;
			case 13: word +=  "thirteen";
			break;
			case 14: word +=  "fourteen";
			break;
			case 15: word += "fifteen";
			break;
			case 16: word +=  "sixteen";
			break;
			case 17: word +=  "seventeen";
			break;
			case 18: word += "eighteen";
			break;
			case 19: word += "ninteen";
			break;
		}
		if(word=="and ")
		{
			word ="";
		}
		return word;
	}
}
