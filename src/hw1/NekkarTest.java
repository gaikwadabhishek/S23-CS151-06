package question1;

import java.util.Date;

public class NekkarTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		@SuppressWarnings("deprecation")
		Date dob = new Date(2002, 6, 16, 3, 38, 12);
		
		Student manasi = new Student("Manasi Nekkar", "I am a 3rd year applied math major.", 
				9467, Branch.OTHER, dob);
		
		System.out.println("Student Name: " + manasi.getName());
		System.out.println("Student Introduction: " + manasi.getIntroduction());
		System.out.println("Student ID: " + manasi.getStudentId());
		System.out.println("Branch: " + manasi.getBranch());
		System.out.println("Student's Date of Birth: " + manasi.getDob());
		
	}

}

