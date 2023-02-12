package hw1;

public class NguyenTest {
	
	public static void main(String[] args) {
		String intro = "My name is Ricky Nguyen, 3rd Year computer science major.";
		Date dob = new Date("06/12/2002);
				   
		Student Nguyen = new Student("Ricky Nguyen", intro, 9181, Branch.COMPUTER_SCIENCE, dob);
				    
		System.out.println(Nguyen.toString());

	}

}
