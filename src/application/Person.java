package application;

public class Person {
	private String name;
	private double height;

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.printf("Defaults are %s for name and %.1f for height.\n", name, height);
	}

	public Person() {
		this.name = "?";
		this.height = 0.0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		/* this is one way
		String text = "Name; " + name + ", height" + height;
		return text;
		*/
		
		//This is another way
		return "Name; " + name + ", height: " + height;
	}
}
