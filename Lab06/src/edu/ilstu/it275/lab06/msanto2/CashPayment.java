/*
 *  Filename:  CashPayment.java
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
 * The Class CashPayment.
 */
public class CashPayment extends Payment {

    /**
     * Instantiates a new cash payment.
     *
     * @param amountPayment the amount of the payment
     */
    public CashPayment(double amountPayment) {
        super(amountPayment);
    }

    /**
     * Prints the payment details for cash.
     */
    @Override
    public void paymentDetails() {
        System.out.println("Payment with cash.");

        super.paymentDetails();
    }
}
