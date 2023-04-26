package exception_handling.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {

		// unchecked
//		System.out.println("Enter a number");
//		int num = -1;
//		try {
//			num = Integer.parseInt("Zero");
//		} catch (NumberFormatException nfe) {
//			System.out.println("number not correct");
//		}
//		System.out.println(num);

		// unchecked
//		String name = null;
//		try {
//		System.out.println("length of string is: " + name.length());
//		int num = Integer.parseInt("Zero");
//		} catch (NullPointerException | NumberFormatException e) {
//			System.out.println("Ran into an exception");
//		}

		// checked exception
		try {
			readFile("random.txt");
			System.out.println("1");
		} catch (FileNotFoundException e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
//		readFile("random.txt");
		System.out.println("FILE ENDED");

	}

	private static void readFile(String fileName) throws FileNotFoundException {
		FileReader file = new FileReader(new File(fileName));
	}
}
