package hw1;

import java.util.Date;

public class PastoralTest {

	public static void main(String args[]) {
		//Creating date this way is deprecated but it still works
		Date birthday = new Date("07/09/2002");
		Student pastoral = new Student("Jordan Pastoral", "Hi, I'm Jordan!", 7550, Branch.SOFTWARE_ENGINEERING, birthday);
		System.out.println(pastoral.toString());
	}

}
