package exception_handling.challenges;

public class Challenge2 {
	public static int returnNum() {
		try {
			System.out.println("something");
			throw new Exception();
//			return 3;

		} catch (Exception e) {
			return 4;
		} finally {
			return 5;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnNum());
	}
}