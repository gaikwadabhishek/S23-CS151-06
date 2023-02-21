package hw1;

import java.util.Date;

public class KimTest {
	
	public static void main(String args[]) {
		
		String name = "Jisoo Kim";
		String introduction = "2nd year";
		int sId = 5628;
		Date dob = new Date(2002, 8, 2);
		
		Student jisoo = new Student(name, introduction, sId, Branch.COMPUTER_SCIENCE, dob);
		
		System.out.print(jisoo.toString());
	}

}
