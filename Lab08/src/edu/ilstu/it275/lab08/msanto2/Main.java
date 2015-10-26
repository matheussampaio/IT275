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
package edu.ilstu.it275.lab08.msanto2;

import java.util.Scanner;

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
        Scanner userIn = new Scanner(System.in);

        int numberOne = userIn.nextInt();
        int numberTwo = userIn.nextInt();

        try {

            System.out.println("Result: " + MyMath.divide(numberOne, numberTwo));

        } catch (ZeroDenominatorException e) {
            System.err.println(e.getMessage());
        } catch (NotEvenlyDivisibleException e) {
            System.err.println(e.getMessage());
        }

        userIn.close();

    }

}
