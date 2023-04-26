package inheritance.exercise1;

class Student extends Person {
	private int id;

	public int getID() {
		return id;
	}
}

class Faculty extends Person {
	private String id;

	public String getID() {
		return id;
	}
}

public class Person extends Object {
	private String name;

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();

		Person r = new Student();
		
		
//		which of the below lines will throw an error
		
		String n = s.getName(); 
//		int m = ((Student) p).getID(); // NOT WORK
//		3 f = q; // IS PERSON A FACULTY ==> Faculty f = new Person() // will not work
//		4 f = new Person(); // will not work
		((Student) r).getID(); // will work after casting
		o = s; // will work

	}
}
