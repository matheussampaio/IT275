/*
 *  Filename:  CreditCardPayment.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Nov 3, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab10.msanto2;

public class CreditCardPayment extends BasePayment {

    protected final double CREDIT_CARD_SURCHARGE = 0.025;

    /**
     * Instantiates a new credit card payment.
     *
     * @param baseAmount the base amount
     */
    public CreditCardPayment(double baseAmount) {
        super(baseAmount);
    }

    /* (non-Javadoc)
     * @see edu.ilstu.it275.lab10.msanto2.Payment#calculatePaymentSurcharge(double)
     */
    @Override
    public double calculatePaymentSurcharge(double amount) {
        return CREDIT_CARD_SURCHARGE * amount;
    }

}
