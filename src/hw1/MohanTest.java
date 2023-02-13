package hw1;
import java.util.Date;

public class MohanTest {
	public static void main(String[] args) {
		Student studentObject = new Student();
		studentObject.setName("Preethi Mohan");
		studentObject.setIntroduction("I am a second year CS major.");
		studentObject.setStudentId(0304);
		studentObject.setBranch(null);
		Date theDate = new Date(2023, 2, 11);
		studentObject.setDob(theDate); 
		studentObject.toString();
	}
}

