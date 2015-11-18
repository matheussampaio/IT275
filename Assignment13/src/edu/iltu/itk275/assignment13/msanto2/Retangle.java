/*
 *  Filename:  Retangle.java
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
 * The Class Retangle.
 */
public class Retangle implements Shape {

    /** The m width. */
    private double mWidth;

    /** The m height. */
    private double mHeight;

    /**
     * Instantiates a new retangle.
     *
     * @param height the height
     * @param width the width
     */
    public Retangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(double height) {
        mHeight = height;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    public void setWidth(double width) {
        mWidth = width;
    }

}
