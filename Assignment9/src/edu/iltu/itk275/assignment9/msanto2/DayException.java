/*
 *  Filename:  DayException.java
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
 * The Class DayException.
 */
public class DayException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5726901895128138407L;

    /** The day. */
    private int mDay;

    /**
     * Instantiates a new day exception.
     *
     * @param day the day
     */
    public DayException(int day) {
        super("The day is invalid: " + day);

        setDay(day);
    }

    /**
     * Gets the day.
     *
     * @return the day
     */
    public int getDay() {
        return mDay;
    }

    /**
     * Sets the day.
     *
     * @param day the new day
     */
    public void setDay(int day) {
        mDay = day;
    }
}
