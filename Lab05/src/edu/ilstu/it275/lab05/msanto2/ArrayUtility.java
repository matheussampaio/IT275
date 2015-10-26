package edu.ilstu.it275.lab05.msanto2;

/**
 * The Class ArrayUtility.
 */
public class ArrayUtility {

    /**
     * Find percentage greater than twenty.
     *
     * @param intArray the int array
     * @return the double
     */
    public double findPercentageGreaterThanTwenty(int[] intArray) {
        double count = 0;

        for (int num : intArray) {
            if (num > 20) {
                count++;
            }
        }

        return count / intArray.length;
    }

    /**
     * Find difference largest smallest.
     *
     * @param intArray the int array
     * @return the int
     */
    public int findDifferenceLargestSmallest(int[] intArray) {
        return findLargestInt(intArray) - findSmallestInt(intArray);
    }

    /**
     * Find smallest int.
     *
     * @param intArray the int array
     * @return the int
     */
    public int findSmallestInt(int[] intArray) {
        int smallestInt = Integer.MAX_VALUE;

        for (int i : intArray) {
            if (i < smallestInt) {
                smallestInt = i;
            }
        }

        return smallestInt;
    }

    /**
     * Find largest int.
     *
     * @param intArray the int array
     * @return the int
     */
    public int findLargestInt(int[] intArray) {
        int largestInt = Integer.MIN_VALUE;

        for (int i : intArray) {
            if (i > largestInt) {
                largestInt = i;
            }
        }

        return largestInt;
    }

    /**
     * Prints the reverse order.
     *
     * @param intArray the int array
     */
    public void printReverseOrder(int[] intArray) {
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }

    }

    /**
     * Increase values.
     *
     * @param intArray the int array
     */
    public void increaseValues(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] *= 4;
        }
    }

}
