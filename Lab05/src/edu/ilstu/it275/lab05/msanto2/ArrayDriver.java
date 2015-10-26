/*
 * Filename:  ArrayDriver.java
 *
 * Programmer: Cathy Holbrook
 * ULID: cjholbr
 *
 * Date:
 *
 * Class:  IT 168
 */
package edu.ilstu.it275.lab05.msanto2;

/**
 * Tester for ArrayUtility
 *
 * @author Cathy Holbrook
 *
 */
public class ArrayDriver {

    public static void main(String[] args) {
        ArrayUtility util = new ArrayUtility();

        /*
         * This is the array that will be used to test the methods
         * to be written in the ArrayUtility class.
         */
        int[] intArray = { 14, 6, 27, 44, 3, 51, 36, 39, 11, 22 };

        //Test percentageGreaterThanTwenty
        System.out.println("Problem 1 - find percentage greater than 20 ");
        double percentage = util.findPercentageGreaterThanTwenty(intArray);
        if (percentage == 0.6) {
            System.out.println("Correct answer:  " + percentage);
        } else {
            System.out.println("Incorrect");
        }

        //Test find diffence between the largest and smallest
        System.out.println("\nProblem 2 - find difference");
        int difference = util.findDifferenceLargestSmallest(intArray);
        if (difference == 48) {
            System.out.println("Correct answer:  " + difference);
        } else {
            System.out.println("Incorrect");
        }

        //Test printIntArray
        System.out.println("\nProblem 3 - print contents of array");
        System.out.println("\nOriginal array:");
        for (int j = 0; j < intArray.length; j++) {
            System.out.println("intArray[" + j + "] = " + intArray[j]);
        }
        System.out.println("\nArray in reverse order:");
        util.printReverseOrder(intArray);

        //Test increaseValue
        System.out.println("\nProblem 4 - increase the value of each element by multiplying by 4");
        System.out.println("\nOriginal array:");
        for (int j = 0; j < intArray.length; j++) {
            System.out.println("intArray[" + j + "] = " + intArray[j]);
        }
        util.increaseValues(intArray);
        System.out.println("\nArray after increase:");
        for (int j = 0; j < intArray.length; j++) {
            System.out.println("intArray[" + j + "] = " + intArray[j]);
        }

    }

}
