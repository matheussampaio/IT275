package edu.iltu.itk275.assignment13.msanto2;

public class Circle implements Shape {

    private double mRadius;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getRadius() {
        return mRadius;
    }

    public void setRadius(double radius) {
        mRadius = radius;
    }

}
