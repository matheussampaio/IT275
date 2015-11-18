/*
 *  Filename:  Square.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Nov 17, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment13.msanto2;

/**
 * The Class Square.
 */
public class Square implements Shape {

    /** The m side length. */
    private double mSideLength;

    /**
     * Instantiates a new square.
     *
     * @param sideLength the side length
     */
    public Square(double sideLength) {
        setSideLength(sideLength);
    }

    @Override
    public double area() {
        return getSideLength() * getSideLength();
    }

    /**
     * Gets the side length.
     *
     * @return the side length
     */
    public double getSideLength() {
        return mSideLength;
    }

    /**
     * Sets the side length.
     *
     * @param sideLength the new side length
     */
    public void setSideLength(double sideLength) {
        this.mSideLength = sideLength;
    }

}
