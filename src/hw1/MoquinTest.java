package hw1;

import java.util.Date;

public class MoquinTest {
	public static void main (String[] args) {
		Student tyler = new Student("Tyler Moquin", "Hello!", 15815722, Branch.COMPUTER_SCIENCE, new Date(1031175660000L));
		System.out.println(tyler);	
	}
}
