package terst;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scanner.nextInt();
		
		if(number%2 ==0) {
			System.out.println("Evn: "+number);
		}else {
			System.out.println("Odd: "+number);
		}
		scanner.close();
	}
}
