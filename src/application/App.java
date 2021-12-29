package application;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Mary", 160);	
		System.out.println(person1.getName());
		System.out.println(person1.getHeight());
		
		Person person2 = new Person("Joe", 170.5);
		System.out.println(person2.getName());
		System.out.println(person2.getHeight());	
		
		Person person3 = new Person();
		System.out.println(person3.getName());
		System.out.println(person3.getHeight());
	}

}
