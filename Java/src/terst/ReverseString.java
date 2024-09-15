package terst;

import java.io.BufferedReader;

public class ReverseString {
	public static String rev(String input) {
		StringBuilder builder = new StringBuilder(input);
		builder.reverse();
		return builder.toString();
		
	}
	public static void main(String[] args) {
		String input = "Hello";
	
		System.out.println("ReverseString: "+rev(input));
	}
}
