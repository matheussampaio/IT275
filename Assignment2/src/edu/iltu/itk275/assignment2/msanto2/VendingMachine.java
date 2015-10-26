package edu.iltu.itk275.assignment2.msanto2;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter item name");
        String itemName = keyboard.nextLine();

        System.out.println("\nEnter the price for " + itemName);
        int itemPrice = keyboard.nextInt();

        System.out.println("\nYou bought " + itemName + " for " + itemPrice + " cents and submitted a dollar, so our change is");

        // Calculate the total charge.
        int totalCharge = 100 - itemPrice;

        // Calculate how many quarters we should use and update the remainingCharge.
        int numQuarters = totalCharge / 25;
        int remainingCharge = totalCharge % 25;

        // Calculate how many dimes we should use and update the remainingCharge.
        int numDimes = remainingCharge / 10;
        remainingCharge %= 10;

        // Calculate how many nickels we should use.
        int numNickels = remainingCharge / 5;

        System.out.println(numQuarters + " Quarters");
        System.out.println(numDimes + " Dimes");
        System.out.println(numNickels + " Nickels");
    }

}
