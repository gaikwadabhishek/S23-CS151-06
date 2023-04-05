package exception_handling.challenges;

public class Challenge1 {

	public static void func1() {
		try {
			String temp = null;
			int num = Integer.parseInt(temp);
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException occured");
		} 
		System.out.println("here");
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException occured");
		}
	}
}
