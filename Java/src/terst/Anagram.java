package terst;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "BeGin";
		String str2 = "being";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Boolean result = Arrays.equals(arr1, arr2);
			if (result) {
				System.out.println("is anagram");
			} else {
				System.out.println("Not!");
			}
		}

	}
}
