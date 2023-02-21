package q1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LieuTest {
	
	public static void main(String[] args) throws ParseException {
		Student alan = new Student();
		Branch branch = Branch.SOFTWARE_ENGINEERING;
		String studentId = "0666";
		int sID = Integer.parseInt(studentId);
		
		//Source: https://www.tutorialspoint.com/how-to-create-date-object-in-java
		String dateString = "03/07/2002";
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = dateFormat.parse(dateString);
		
		alan.setName("Alan");
		alan.setIntroduction("3rd year, I like to play video games");
		alan.setStudentId(sID);	//integer can't start with 0
		alan.setBranch(branch); 
		alan.setDob(date);
		
		System.out.println(alan.toString());
	}
}
