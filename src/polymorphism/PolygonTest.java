package polymorphism;

public class PolygonTest {

	public static void main(String[] args) {
		Polygon square = new Square();
		System.out.println(square.area(5));
		System.out.println(square.perimeter(5));
	}
}
