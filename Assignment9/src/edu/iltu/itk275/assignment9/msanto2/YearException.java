/*
 *  Filename:  YearException.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 26, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment9.msanto2;

/**
 * The Class YearException.
 */
public class YearException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5971746708022924438L;

    /** The year. */
    private int mYear;

    /**
     * Instantiates a new year exception.
     *
     * @param year the year
     */
    public YearException(int year) {
        super("The year must be in the range 1000 to 3000 (inclusive): " + year);

        setYear(year);
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear() {
        return mYear;
    }

    /**
     * Sets the year.
     *
     * @param year the new year
     */
    private void setYear(int year) {
        mYear = year;
    }

}
