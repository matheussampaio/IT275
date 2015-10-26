/**
 *
 */
package edu.ilstu.it275.lab03.msanto2;

import java.util.Scanner;

/**
 * Compute the sum of the first n positive odd integers.
 *
 * @author matheussampaio
 *
 */
public class OddIntegers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What n should I use? ");

        int n = keyboard.nextInt();

        int sum = 0;

        for (int i = 1; i < n * 2; i += 2) {
            sum += i;
        }

        System.out.println("The sum of the firts " + n + " positives odd integers is: " + sum);
    }

}
