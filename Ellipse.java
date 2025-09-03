package oop.ocp;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Getters and setters
    public double getMajorAxis() { return majorAxis; }
    public double getMinorAxis() { return minorAxis; }
    public void setMajorAxis(double majorAxis) { this.majorAxis = majorAxis; }
    public void setMinorAxis(double minorAxis) { this.minorAxis = minorAxis; }
}
