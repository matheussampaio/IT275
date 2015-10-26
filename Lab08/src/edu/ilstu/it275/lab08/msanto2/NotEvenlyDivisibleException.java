/*
 *  Filename:  NotEvenlyDivisibleException.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 19, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab08.msanto2;

/**
 * The Exception NotEvenlyDivisibleException.
 */
public class NotEvenlyDivisibleException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2693231350776473132L;

    /** The denominator. */
    private int mDenominator;

    /** The numerator. */
    private int mNumerator;

    /**
     * Instantiates a new Not Evenly Divisible Exception.
     *
     * @param numerator the numerator
     * @param denominator the denominator
     */
    public NotEvenlyDivisibleException(int numerator, int denominator) {
        super("The division don't have an evenly result: " + numerator + " / " + denominator);

        setNumerator(numerator);
        setDenominator(denominator);
    }

    /**
     * Gets the denominator.
     *
     * @return the denominator
     */
    public int getDenominator() {
        return mDenominator;
    }

    /**
     * Sets the denominator.
     *
     * @param denominator the new denominator
     */
    private void setDenominator(int denominator) {
        mDenominator = denominator;
    }

    /**
     * Gets the numerator.
     *
     * @return the numerator
     */
    public int getNumerator() {
        return mNumerator;
    }

    /**
     * Sets the numerator.
     *
     * @param numerator the new numerator
     */
    private void setNumerator(int numerator) {
        mNumerator = numerator;
    }
}
