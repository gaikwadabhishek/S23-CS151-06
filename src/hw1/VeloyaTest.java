package hw1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VeloyaTest {
	public static void main(String[] args) {
		Student myStudent = new Student();
		Date robertDay = new Date("04/04/2001");
		myStudent.setName("Robert Veloya");
		myStudent.setIntroduction("3rd Year Student");
		myStudent.setStudentId(3964);
		myStudent.setDob(robertDay);
		myStudent.setBranch(Branch.COMPUTER_SCIENCE);
		System.out.println(myStudent);
	}
}
