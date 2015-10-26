/*
 *  Filename:  MonthException.java
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
 * The Exception MonthException.
 */
public class MonthException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6589971056958781878L;

    /** The month. */
    private int mMonth;

    /**
     * Instantiates a new month exception.
     *
     * @param month the month
     */
    public MonthException(int month) {
        super("The month number must be between 1 and 12: " + month);

        setMonth(month);
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * Sets the month.
     *
     * @param month the new month
     */
    private void setMonth(int month) {
        mMonth = month;
    }
}
