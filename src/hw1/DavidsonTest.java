package hw1;

import java.sql.Date;

public class DavidsonTest {
	public static void main(String args[]) {
		Student griffin = new Student(
				/* name: */"Griffin Davidson", 
				/* introduction: */"Sophomore at SJSU, plays Lacrosse", 
				/* studentID number: */495, 
				/* major branch: */Branch.SOFTWARE_ENGINEERING, 
				/* date of birth: */Date.valueOf("2003-3-15"));
		
		System.out.println("Name: " + griffin.getName());
		System.out.println("Introduction: " + griffin.getIntroduction());
		System.out.println("StudentID Number: 0" + griffin.getStudentId()); /*wouldnt let me add the 0 in the first place*/
		System.out.println("Branch: " + griffin.getBranch());
		System.out.println("Date of Birth: " + griffin.getDob());
	}
}
