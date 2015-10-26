/*
 *  Filename:  ConvertLoop.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: 08/31/2015
 *
 *  Class: IT275
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section:
 *  Lab Instructor:
 */
package edu.ilstu.it275.lab03.msanto2;

/**
 * Converts given nested for loops to nested while loops
 *
 * @author Holbrook
 *
 */
public class ConvertLoop {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Original code with for loop");
        int s = 0;
        int t = 1;

        for (int i = 0; i < 5; i++) {
            s = s + i;
            for (int j = i; j > 0; j--) {
                t = t + j - 1;
            }
            s = s + t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);

        System.out.println("\n\nNew code with while loop");

        /* **************************************************
         * Add new code here
         ****************************************************/

        s = 0;
        t = 1;
        int i = 0;

        while (i < 5) {
            s += i;

            int j = i;

            while (j > 0) {
                t += j - 1;

                j--;
            }

            s += t;

            System.out.println("T is " + t);
            i++;
        }

        System.out.println("S is " + s);

    }

}
