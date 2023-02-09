package hw1.Q4;

import java.lang.Math.*;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {};

    public Vector(double xcoord, double ycoord, double zcoord) {
        this.x = xcoord;
        this.y = ycoord;
        this.z = zcoord;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector add(Vector v) {
        Vector newVector = new Vector();

        newVector.setX(this.x + v.getX());
        newVector.setY(this.y + v.getY());
        newVector.setZ(this.z + v.getZ());

        return newVector;
    }

    public double dotProduct(Vector v) {
        double product = v.getX() * this.x + v.getY() * this.y + v.getZ() * this.z;

        return product;
    }

    public double computeMagnitude() {
        double magnitude = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return magnitude;
    }

    public void normalize() {

    }

    public Vector scaleVector(double factor) {
        Vector newVector = new Vector();
        newVector.setX(this.x * factor);
        newVector.setY(this.y * factor);
        newVector.setZ(this.z * factor);

        return newVector;
    }
}
