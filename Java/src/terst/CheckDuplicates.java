package terst;

import java.util.HashSet;

public class CheckDuplicates {
	public static boolean hasDuplicate(int[] array) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : array) {
			if (!set.add(num)) {
				return true; // Duplicate found
			}
		}
		return false; // No duplicates
	}

	public static void main(String[] args) {
		int[] numbers = {  2, 3, 4, 5, 1 };
		if (hasDuplicate(numbers)) {
			System.out.println("Contains duplicate");
		} else {
			System.out.println("No duplicates");
		}
	}
}

//	private static boolean hasDuplicate(int[] numbers) {
//		HashSet<Integer> set = new HashSet<>();
//		for(int num: numbers) {
//			  if (!set.add(num)) {
//	                return true; // Dupli
//		}
//		
//		return false;
//	}
