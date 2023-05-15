package generics.demo;

class Temp extends Thread {
	
}

public class PrintInteger {

	Integer a;

	public PrintInteger(int a) {
		this.a = a;
	}
	
	public void print() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
//		Print<Integer> one = new Print<>(1);
//		one.print();
//		Print<Float> two = new Print<>(2.000f);
//		two.print();
//		Print<String> three = new Print<>("three");
//		three.print();
		PrintInteger one = new PrintInteger((int) 1.234f);
	}
}

class PrintFloat {

	Float a;

	public PrintFloat(float a) {
		this.a = a;
	}
	
	public void print() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		PrintInteger one = new PrintInteger(1);
		one.print();
	}
}

class Print <T1, T2> { //int, float, primate Integer/FLoat- etc will work
	T1 a;
	T2 b;

	public Print(T1 a, T2 b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println(a  +" " + b);
	}
	
	public static void main(String[] args) {
		Print<Integer, String> one = new Print<>(1, "two");
		one.print();
	}
}
