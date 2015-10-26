package edu.ilstu.it275.lab04.msanto2;

/**
 * Circle class with methods for calculate properties of that circle.
 *
 * @author matheussampaio
 */
public class Circle {

    /** The PI constant. */
    final double PI = 3.14159;

    /** The radius. */
    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Calculate area of the Circle.
     *
     * @return the area
     */
    double calculateArea() {
        return PI * radius * radius;
    }

    /**
     * Calculate diameter of the Circle.
     *
     * @return the diameter
     */
    double calculateDiameter() {
        return radius * 2;
    }

    /**
     * Calculate circumference of the Circle.
     *
     * @return the circumference
     */
    double calculateCircumference() {
        return 2 * PI * radius;
    }

    /**
     * Sets the radius of the Circle.
     *
     * @param r the new radius
     */
    void setRadius(double r) {
        radius = r;
    }

    /**
     * Gets the radius of the Circle.
     *
     * @return the radius
     */
    double getRadius() {
        return radius;
    }
}
