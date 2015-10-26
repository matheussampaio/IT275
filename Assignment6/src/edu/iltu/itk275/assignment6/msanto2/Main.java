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
package edu.iltu.itk275.assignment6.msanto2;

import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

    /** The password. */
    private static String PASSWORD = "12345";

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        RandomizedChallengeResponse rcr = new RandomizedChallengeResponse(PASSWORD);

        rcr.printRandomEntry();

        String userInput = keyboard.nextLine();

        if (rcr.verifyPassword(userInput)) {
            System.out.println("User’s input correctly matches the PIN number.");
        } else {
            System.out.println("User’s input is wrong.");
        }

        keyboard.close();
    }

}
