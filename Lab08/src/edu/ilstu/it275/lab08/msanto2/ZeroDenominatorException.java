/*
 *  Filename:  ZeroDenominatorException.java
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
 * The Exception ZeroDenominatorException.
 */
public class ZeroDenominatorException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6956162644875821793L;

    /**
     * Instantiates a new zero denominator exception.
     */
    public ZeroDenominatorException() {
        super("Can't make a division with zero denominator.");
    }
}
