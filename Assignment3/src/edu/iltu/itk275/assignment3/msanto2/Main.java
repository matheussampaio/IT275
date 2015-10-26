package edu.iltu.itk275.assignment3.msanto2;

import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     * Ask about the mother and father information and print the estimated child height.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the gender (M/F):");
            String gender = keyboard.nextLine();

            System.out.println("You want to use feet or inches? (F/I)");
            String unit = keyboard.nextLine();

            System.out.println("Enter the height of the mother:");
            int heightMother = keyboard.nextInt();

            System.out.println("Enter the height of the father:");
            int heightFather = keyboard.nextInt();

            if (unit.equalsIgnoreCase("F")) {
                heightMother = feetToInches(heightMother);
                heightFather = feetToInches(heightFather);
            }

            int heightChild = calculateHeight(gender, heightMother, heightFather);

            System.out.printf("The height of the child will be: %d\n", heightChild);

            System.out.println("Again (y)?");
            String again = keyboard.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                break;
            }
        }

        keyboard.close();

    }

    /**
     * Calculate height.
     *
     * @param gender the gender (M/F)
     * @param heightMother the height of the mother.
     * @param heightFather the height of the father.
     * @return the height of the child.
     */
    public static int calculateHeight(String gender, double heightMother, double heightFather) {
        if (gender.equalsIgnoreCase("M")) {
            return (int) (((heightMother * 13) / 12) + heightFather) / 2;
        } else {
            return (int) (((heightFather * 12) / 13) + heightMother) / 2;
        }
    }

    /**
     * Feet to inches.
     *
     * @param feet the height in feet.
     * @return the height in inches.
     */
    public static int feetToInches(int feet) {
        return feet * 12;
    }
}
