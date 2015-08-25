/**
 *
 */
package edu.ilstu.it275.lab02.msanto2;

/**
 * Calculates the restaurant bill, including taxes and tips.
 */
public class RestaurantBillCalculator {

    /**
     * Calculates and print the tax, tip and total amount of the restaurant
     * bill.
     *
     * @param args
     */
    public static void main(String[] args) {
        final double TIP_PERCENTAGE = 0.15;
        final double TAX_RATE = 0.075;

        double mealCost = 45.75;

        double taxAmount = 0;
        double tipAmount = 0;
        double totalAmount = 0;

        taxAmount = mealCost * TAX_RATE;
        tipAmount = mealCost * TIP_PERCENTAGE;

        totalAmount = mealCost + taxAmount + tipAmount;

        System.out.printf("Meal Cost: $%f\n", mealCost);
        System.out.printf("Tax: $%f\n", taxAmount);
        System.out.printf("Tip: $%f\n", tipAmount);
        System.out.printf("Total amount: $%f\n", totalAmount);

    }

}
