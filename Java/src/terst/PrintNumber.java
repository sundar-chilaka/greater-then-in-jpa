package terst;

public class PrintNumber {
	public static void printNum(int i) {
		if(i<10) {
			System.out.println(i);
			printNum(i+1);
		}
	}
	public static void main(String[] args) {
		printNum(1);
	}
}
