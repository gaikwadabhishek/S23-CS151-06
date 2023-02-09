package hw1;
import java.util.*;
public class NguyenTest {
	
	public static void main(String[] args) {
		Branch major = Branch.SOFTWARE_ENGINEERING;
		Date birthday = new Date("03/11/2004");
		Student hoangNguyen = new Student("Hoang Nguyen", 
				"My name is Hoang Nguyen", 3619, major, birthday);
		System.out.println(hoangNguyen.toString());
	}

}
