package terst;

public class Swapping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a: "+a+" "+"b: "+b);
		//swapping numbers 
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a+" "+"b: "+b);
	}
}
