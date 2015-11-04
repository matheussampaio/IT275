/*
 *  Filename:  Main.java
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

public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        CreditCardPayment cc = new CreditCardPayment(100);
        DebitCardPayment dc = new DebitCardPayment(100);

        System.out.println(cc.getBaseAmount());
        System.out.println(dc.getBaseAmount());
    }

}
