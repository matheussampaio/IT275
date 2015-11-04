/*
 *  Filename:  BasePayment.java
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
 * The Class BasePayment.
 */
public abstract class BasePayment implements Payment {

    /** The payment surcharge. */
    protected double mBaseAmount = 0.0;

    /**
     * Instantiates a new base payment.
     *
     * @param baseAmount the base amount
     */
    public BasePayment(double baseAmount) {
        setBaseAmount(baseAmount + calculatePaymentSurcharge(baseAmount));
    }

    /**
     * Gets the base amount.
     *
     * @return the base amount
     */
    public double getBaseAmount() {
        return mBaseAmount;
    }

    /**
     * Sets the base amount.
     *
     * @param baseAmount the new base amount
     */
    public void setBaseAmount(double baseAmount) {
        mBaseAmount = baseAmount;
    }

}
