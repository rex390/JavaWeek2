package ReverseString;

public class Main {

	public static void main(String[] args) 
	{
		String message = "i am going to london";
		Reverse reverse = new Reverse();
		//reverse.runReverse();
		reverse.findAndReplace("o", "***", message);
		//reverse.find("i", message);
	}

	

}
