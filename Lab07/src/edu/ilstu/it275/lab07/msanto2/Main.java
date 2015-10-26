/*
 *  Filename:  Main.java
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
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        CashPayment cp = new CashPayment(100);
        cp.paymentDetails();

        CreditCardPayment ccp = new CreditCardPayment(100, "Matheus Sampaio", "10/20", "0000-1111-2222-3333");
        ccp.paymentDetails();

    }

}
