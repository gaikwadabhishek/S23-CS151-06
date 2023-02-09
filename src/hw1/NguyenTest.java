/*
 * Hoang Nguyen
 * Homework 1, part 1
 * 
 * Resources: 
 * Date Class: https://www.geeksforgeeks.org/date-class-java-examples/
 * Enum: https://www.geeksforgeeks.org/enum-in-java/
 */
package hw1;
import java.util.Date;
public class NguyenTest {
	
	public static void main(String[] args) {
		Branch major = Branch.SOFTWARE_ENGINEERING;
		//Reference to geeksforgeeks Data class in Java
		Date birthday = new Date("03/11/2004");
		Student hoangNguyen = new Student("Hoang Nguyen", 
				"My name is Hoang Nguyen", 3619, major, birthday);
		System.out.println(hoangNguyen.toString());
	}

}
