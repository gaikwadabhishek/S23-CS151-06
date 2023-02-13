package hw1;

import java.util.Date;

public class KaoTest {
	public static void main(String[] args) {
		Date dob = new Date("07/26/03"); // referred to https://www.geeksforgeeks.org/date-class-java-examples/
		Student s1 = new Student("Natalie", "Hello", 1354, Branch.SOFTWARE_ENGINEERING, dob);
		System.out.println(s1.toString());

	}
}
