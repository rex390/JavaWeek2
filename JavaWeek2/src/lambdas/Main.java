package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
	interface MyString {
		String myStringFunction(String str);
	}

	public static String reverseStr(MyString reverse, String str){
	  return reverse.myStringFunction(str);
	}
	
	public static String reverseStr2(Function<String, String> reverse, String str) {
		return reverse.apply(str);
	}
	
	public static Integer applyOperator(BiFunction<Integer, Integer, Integer> operator, int first, int second) {
		return operator.apply(first, second);
	}

	public static void main (String args[]) {
		// Block lambda to reverse string
//		MyString reverse = (str) -> {
//			String result = "";
//			
//			for(int i = str.length()-1; i >= 0; i--)
//				result += str.charAt(i);
//			
//			return result;
//		};
		
		Function<String, String> reverse = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr2(reverse, "Lambda Demo")); 
		System.out.println(applyOperator(Main::add, 2, 3));
		System.out.println(applyOperator(Main::sub, 4, 3));
		System.out.println(applyOperator((num1, num2) -> num1 * num2, 4, 3));
	}
	
	public static Integer add(Integer num1, Integer num2) {
		return num1 + num2;
	}
	
	public static Integer sub(Integer num1, Integer num2) {
		return num1 - num2;
	}
}
