package terst;

public class Person {

	private String name;
	private int age;
	
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
	}
	public boolean isAudlt() {
		return age>=18;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Sundar", 17);
		person.displayDetails();
		
		System.out.println("Is adult: "+person.isAudlt());
	}
}
