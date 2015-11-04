/*
 *  Filename:  DebitCardPayment.java
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

/**
 * The Class DebitCardPayment.
 */
public class DebitCardPayment extends BasePayment {

    /** The Constant DEBIT_CARD_SURCHARGE. */
    protected final double DEBIT_CARD_SURCHARGE = 0.015;

    /**
     * Instantiates a new debit card payment.
     *
     * @param baseAmount the base amount
     */
    public DebitCardPayment(double baseAmount) {
        super(baseAmount);
    }

    @Override
    public double calculatePaymentSurcharge(double amount) {
        return DEBIT_CARD_SURCHARGE * amount;
    }

}
