package application;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Mary", 160);	
		Person person2 = new Person("Joe", 170.5);
		Person person3 = new Person();
		
		/* Easier way of doing these is shown below
		System.out.println(person1.getName());
		System.out.println(person1.getHeight());
		

		System.out.println(person2.getName());
		System.out.println(person2.getHeight());	
		

		System.out.println(person3.getName());
		System.out.println(person3.getHeight());
		*/
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		// String automatically calls the toString method
		// so can replace the above with:
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		// All of the above makes the main method a lot cleaner
	}

}
