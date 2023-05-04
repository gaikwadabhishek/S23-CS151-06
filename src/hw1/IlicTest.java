package hw1;

import java.util.Date;

public class IlicTest {
	
	//main function
	public static void main(String[] args) {
		
		Student ilic = new Student("Elena Ilic", "Hello!", 2222, Branch.COMPUTER_SCIENCE,new Date(2000, 11, 12) );
		//name: Elena Ilic, greeting: Hello!, ID: 2222, Branch: Computer Science, DOB: 12/12/2000
		//2222 is used as 4-digit student id because original id starts with 0
		
		System.out.print(ilic.toString());
		//print student data
	}
}
