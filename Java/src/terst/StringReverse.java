package terst;

public class StringReverse {
	public static void main(String[] args) {
		String input = "Sundar";
		String resverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			resverse = resverse + input.charAt(i);

//			
		}
		System.out.println("resverse: " + resverse);
	}
}
