package hw1;

import java.util.Date;

public class MakarewyczTest {

	public static void main(String[] args) {

		String myName = "Danilo";
		String intro = "Hi i'm a second-year CS major who has too many/not enough model kits";
		int id = 8319;
		Branch major = Branch.COMPUTER_SCIENCE;
		Date birthday = new Date(103, 5, 9);
		Student danilo = new Student(myName, intro, id, major, birthday);
		System.out.println(danilo.toString());
	}

}
