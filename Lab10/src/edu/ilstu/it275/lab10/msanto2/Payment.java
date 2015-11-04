/*
 *  Filename:  Payment.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Nov 2, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab10.msanto2;

/**
 * The Interface Payment.
 */
public interface Payment {

    /**
     * Calculate payment surcharge.
     *
     * @param amount the amount
     * @return the double
     */
    public double calculatePaymentSurcharge(double amount);

}
