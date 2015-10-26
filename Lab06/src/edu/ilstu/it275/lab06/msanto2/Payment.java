/*
 *  Filename:  Payment.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Sep 28, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab06.msanto2;

/**
 * The Class Payment.
 */
public class Payment {

    /** The amount of the payment. */
    private double mAmountPayment;

    /**
     * Instantiates a new Payment.
     *
     * @param amountPayment the amount of the payment
     */
    public Payment(double amountPayment) {
        setAmountPayment(amountPayment);
    }

    /**
     * Prints the basic payment details.
     */
    public void paymentDetails() {
        System.out.printf("Amount of the payment: $%.2f\n", getAmountPayment());
    }

    /**
     * Gets the amount of the payment.
     *
     * @return the amount of the payment
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
