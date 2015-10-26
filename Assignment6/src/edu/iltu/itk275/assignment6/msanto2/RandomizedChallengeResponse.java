/*
 *  Filename:  RandomizedChallengeResponse.java
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

import java.util.Random;

/**
 * The Class RandomizedChallengeResponse.
 */
public class RandomizedChallengeResponse {

    /** The random numbers. */
    private int[] mRandomNumbers = new int[10];

    /** The password encrypted. */
    private int[] mPasswordEncrypted = new int[5];

    /**
     * Instantiates a new randomized challenge response.
     *
     * @param password the password
     */
    public RandomizedChallengeResponse(String password) {
        randomizeNumbers();
        encryptPassword(password);
    }

    /**
     * Uses the random numbers to encrypt the password and store.
     *
     * @param password the password
     */
    private void encryptPassword(String password) {
        String[] splitPassword = password.split("");

        for (int i = 0; i < splitPassword.length; i++) {
            int index = Integer.parseInt(splitPassword[i]);

            mPasswordEncrypted[i] = mRandomNumbers[index];
        }
    }

    /**
     * Randomize numbers.
     */
    private void randomizeNumbers() {
        Random random = new Random();

        for (int i = 0; i < mRandomNumbers.length; i++) {
            mRandomNumbers[i] = (int) ((random.nextFloat() * 3) + 1);
        }
    }

    /**
     * Prints the random entry.
     */
    public void printRandomEntry() {
        System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
        System.out.printf("NUM: ");

        for (int i = 0; i < (mRandomNumbers.length - 1); i++) {
            System.out.printf("%d ", mRandomNumbers[i]);
        }

        System.out.printf("%d\n", mRandomNumbers[mRandomNumbers.length - 1]);
    }

    /**
     * Verify password.
     *
     * @param userInput the user input
     * @return true, if user input match.
     */
    public boolean verifyPassword(String userInput) {
        String[] splitInput = userInput.split("");

        // If user input length is different from 5, return false.
        if (splitInput.length != 5) {
            return false;
        }

        // If any char is different, return false.
        for (int i = 0; i < splitInput.length; i++) {
            if (Integer.parseInt(splitInput[i]) != mPasswordEncrypted[i]) {
                return false;
            }
        }

        // Otherwise, return true.
        return true;
    }
}
