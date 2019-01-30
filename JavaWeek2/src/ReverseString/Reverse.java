package ReverseString;

import java.util.Scanner;

public class Reverse 
{
	public void runReverse()
	{
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
		{
			String input = sc.nextLine();
			if(!input.equals(""))
			{
				reverseTheWorld(input);
			}
			else
			{
				System.out.println("no input");
			}
		}
	}
	private void reverseTheWorld(String word)
	{
		String[] words = word.split(" ");
		for(int count = words.length-1;count>=0 ;count--)
		{
			if(!words[count].equals(""))
			{
				System.out.println(words[count]);
			}			
		}
	}
	
	public void find(String word, String message)
	{
		String[] words = message.split(" ");
		int count = 0;
		String printedMessage =  word + " was found in the message " + count + " times";		
		for(String oneWord:words)
		{
			count+=compareCharacters(oneWord,word);
			if(oneWord.equals(word))
			{				
				count++;			
			}
			printedMessage = word + " was found in the message " + count + " times";
		}
		System.out.println(printedMessage);
	}
	
	public int compareCharacters(String word,String find)
	{
		String[] characters = word.split("");
		String builtWord = "";
		int count = 0;
		for(int countFirstCharacter = 0 ; countFirstCharacter < word.length();countFirstCharacter++)
		{
			builtWord=characters[countFirstCharacter];
			if(builtWord.equals(find))
			{
				count++;
			}
			
			for(int countSecondCharacter = 1 ; countSecondCharacter < word.length();countSecondCharacter++)
			{
				if(countSecondCharacter>countFirstCharacter)
				{
					builtWord+=characters[countSecondCharacter];
				}
				if(builtWord.equals(find))
				{
					count++;
				}
			}
		}
		return count;
	}
	public void findAndReplace(String word, String replace, String message)
	{
		String[] words = message.split(" ");
		String printedMessage="";
		for(int count = 0;count<words.length;count++)
		{
			words[count] = (compareAndReplaceCharacters(words[count],word,replace));
			if(words[count].equals(word))
			{
				words[count] = replace;
			}
			System.out.println(words[count]);
		}
	}
	
	
	public String compareAndReplaceCharacters(String word,String find,String replace)
	{
		String[] characters = word.split("");

		String builtWord = "";
		String returnWord = "";
		for(int countFirstCharacter = 0 ; countFirstCharacter < word.length();countFirstCharacter++)
		{
			builtWord=characters[countFirstCharacter];
			if(builtWord.equals(find))
			{
				characters[countFirstCharacter]=replace;
			}
			
			for(int countSecondCharacter = 1 ; countSecondCharacter < word.length();countSecondCharacter++)
			{
				if(countSecondCharacter>countFirstCharacter)
				{
					builtWord+=characters[countSecondCharacter];
				}
				if(builtWord.equals(find))
				{
					characters[countFirstCharacter]=replace;
					for(int i = countFirstCharacter; i <= countSecondCharacter;i++)
					{
						characters[i] = " ";
					}	
					characters[countFirstCharacter]=replace;
				}
			}
		}
		for(String oneWord:characters)
		{
			if(oneWord ==" ")
			{
				oneWord ="";
			}
			returnWord +=oneWord;
		}
		return returnWord;
	}
		
}
