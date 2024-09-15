package terst;

public class Palindram {
	public static void main(String[] args) {
		String input = "MOM";
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);

		}
		if (input.equals(reverse)) {
			System.out.println("is palindram");
		} else {
			System.out.println("Not!");
		}
	}
}
