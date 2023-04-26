package exception_handling.demo;

class PasswordLessThan8Characters extends Exception {
	public PasswordLessThan8Characters() {
		System.out.println("password should be 8 characters");
	}
}

public class PasswordChecker {
	public static void main(String[] args) {
		String password = "CS151";
		// password has 1 upper case
		// 1 lower case, 1 special char and > 8 chars

		try {
			checkIfPasswordIsStrong(password);
		} catch (PasswordLessThan8Characters e) {
//			System.out.println("password should be 8 characters");
		}

	}

	private static void checkIfPasswordIsStrong(String password) throws PasswordLessThan8Characters {
		if (password.length() < 8) {
			throw new PasswordLessThan8Characters();
		}
	}
}
