package hw1.Q4;

public class VectorMain {
    public static void main(String[] args) {
        Vector testVector = new Vector(1, 2, 3);
        Vector v = new Vector(6, 7, 8);

        System.out.println("Adding method: " + vectorInfo(testVector.add(v)));
        System.out.println("Dot product: " + testVector.dotProduct(v));
        System.out.println("Computing magnitude: " + testVector.computeMagnitude());
        // normalize
        System.out.println("Scaling vector: " + vectorInfo(testVector.scaleVector(5)));
    }

    public static String vectorInfo(Vector vector) {
        return "x: " + vector.getX() + ", y: " + vector.getY() + ", z: " + vector.getZ();
    }
}
