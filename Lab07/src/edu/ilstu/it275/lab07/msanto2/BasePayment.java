/*
 *  Filename:  BasePayment.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Sep 28, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab07.msanto2;

/**
 * The Class BasePayment.
 */
public abstract class BasePayment implements Payment {

    /** The amount of the payment. */
    private double mAmountPayment;

    /**
     * Instantiates a new base payment.
     *
     * @param amountPayment the amount of the payment
     */
    public BasePayment(double amountPayment) {
        setAmountPayment(amountPayment);
    }

    /**
     * Gets the amount of the payment.
     *
     * @return the amount payment
     */
    public double getAmountPayment() {
        return mAmountPayment;
    }

    /**
     * Sets the amount of the payment.
     *
     * @param amountPayment the new amount of the payment
     */
    public void setAmountPayment(double amountPayment) {
        mAmountPayment = amountPayment;
    }

}
