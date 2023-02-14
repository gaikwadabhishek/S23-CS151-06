package hw1;
import java.util.Date;

public class MohanTest {
	public static void main(String[] args) {
		String name = "Preethi Mohan";
		String intro = "I am a second year CS major.";
		int id = 3045;
		Branch theBranch = Branch.COMPUTER_SCIENCE;
		Date theDate = new Date(2023, 2, 11);
		
		Student theStudent = new Student(name, intro, id, theBranch, theDate);
		
		System.out.println(theStudent.toString());
	}
}

