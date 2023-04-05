package polymorphism;

public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {

		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public static void main(String[] args) {
		Person abhishek = new Student("Abhishek", 1);
		System.out.println(abhishek.toString());
	}

}

class Student extends Person {
	int studentID;

	public Student(String name, int studentID) {
		super(name);
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + "]";
	}
}
