/* 
 * 
 * James Kim
 * CS151 HW1 Q1
 * February 14, 2023
 * 
 */

package hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KimTest {

	// Reference: https://www.geeksforgeeks.org/java-simpledateformat-set-1/
	// Created a method to format the date but realized this would not print the
	// date this way because of the specified toString method, but keeping the 
	// method for the date input for argument.
	public static Date inFormat(String dob) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = new Date();

		try {
			date = simpleDateFormat.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;

	}

	public static void main(String[] args) {

		String dob = "01-13-1997";

		Student student = new Student("James Kim", "Hello World", 334455, Branch.OTHER, inFormat(dob));

		System.out.println(student);

	}

}
