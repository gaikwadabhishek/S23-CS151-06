package generics.demo;

class Printer <T> {

	T somethingToPrint;
	
	public Printer(T d) {
		this.somethingToPrint = d;
	}
	
	public void print() {
		System.out.println(somethingToPrint);
	}
	
	public static void main(String[] args) {
		Printer<Integer> printer = new Printer(5);
		printer.print();
		Printer<Double> printer1 = new Printer(5.423423);
		printer1.print();
	}
}
