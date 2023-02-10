package hw1.Q4;

public class VectorMain {
    public static void main(String[] args) {
        Vector testVector = new Vector(1, 2, 3);
        Vector v = new Vector(6, 7, 8);

        System.out.println("Adding method: " + vectorInfo(testVector.add(v)));
        System.out.println("Dot product: " + testVector.dotProduct(v));
        System.out.println("Computing magnitude: " + testVector.computeMagnitude());
        System.out.println("Scaling vector: " + vectorInfo(testVector.scaleVector(5)));
        testVector.normalize();
        System.out.println("Normalizing method: x = " + testVector.getX() + ", y = " + testVector.getY() + ", z = " + testVector.getZ());
    }

    public static String vectorInfo(Vector vector) {
        return "x: " + vector.getX() + ", y: " + vector.getY() + ", z: " + vector.getZ();
    }
}
