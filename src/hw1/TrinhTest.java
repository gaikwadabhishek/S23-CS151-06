package hw1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrinhTest {
	public static void main(String[] args) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = format.parse("23/12/1996");
		Student s1 = new Student("Da Thao Trinh", "Hello", 6956, Branch.COMPUTER_SCIENCE, dob);
		
		System.out.println(s1.toString());
		
	}
}
