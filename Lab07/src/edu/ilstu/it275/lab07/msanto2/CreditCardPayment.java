/*
 *  Filename:  CreditCardPayment.java
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
 * The Class CreditCardPayment.
 */
public class CreditCardPayment extends BasePayment {

    /** The Card Name. */
    private String mCardName;

    /** The Expiration Date. */
    private String mExpirationDate;

    /** The Card Number. */
    private String mCardNumber;

    /**
     * Instantiates a new credit card payment.
     *
     * @param amountPayment the amount of the payment
     * @param cardName the card name
     * @param expirationDate the expiration date
     * @param cardNumber the card number
     */
    public CreditCardPayment(double amountPayment, String cardName, String expirationDate, String cardNumber) {
        super(amountPayment);

        setCardName(cardName);
        setExpirationDate(expirationDate);
        setCardNumber(cardNumber);
    }

    /**
     * Prints the credit card and payment details.
     */
    @Override
    public void paymentDetails() {
        System.out.println("Card Number: " + getCardNumber());
        System.out.println("Card Name: " + getCardName());
        System.out.println("Card Expiration Date: " + getExpirationDate());

        System.out.printf("Amount of the payment: $%.2f\n", getAmountPayment());
    }

    /**
     * Gets the card name.
     *
     * @return the card name
     */
    public String getCardName() {
        return mCardName;
    }

    /**
     * Sets the card name.
     *
     * @param cardName the new card name
     */
    private void setCardName(String cardName) {
        mCardName = cardName;
    }

    /**
     * Gets the expiration date.
     *
     * @return the expiration date
     */
    public String getExpirationDate() {
        return mExpirationDate;
    }

    /**
     * Sets the expiration date.
     *
     * @param expirationDate the new expiration date
     */
    private void setExpirationDate(String expirationDate) {
        mExpirationDate = expirationDate;
    }

    /**
     * Gets the card number.
     *
     * @return the card number
     */
    public String getCardNumber() {
        return mCardNumber;
    }

    /**
     * Sets the card number.
     *
     * @param cardNumber the new card number
     */
    private void setCardNumber(String cardNumber) {
        mCardNumber = cardNumber;
    }

}
