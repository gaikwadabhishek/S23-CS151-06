package polymorphism;

public interface Polygon {
	
	public static final int id = 1;
	public double area(int... sides);
	public double perimeter(int... sides);
	
	// bad practice
	public default String type() {
		return "Polygon";
	}
}

class Square implements Polygon {	
	
	@Override
	public double area(int... sides) {
		return sides[0] * sides[0];
	}

	@Override
	public double perimeter(int... sides) {
		return (sides[0]) * 4;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return null;
	}
	
}