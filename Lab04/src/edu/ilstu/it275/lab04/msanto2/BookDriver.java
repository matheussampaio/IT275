package edu.ilstu.it275.lab04.msanto2;

import java.util.Scanner;

public class BookDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Book bookLifeOfPi = new Book("Life of Pi", 13.50);
        Book bookHarryPotter = new Book("Harry Potter: Goblet of Fire", 22.00);

        System.out.println("How many books Life of Pi sold?");
        int lifeOfPiSales = keyboard.nextInt();

        System.out.println("How many books Harry Potter: Goblet of Fire sold?");
        int harryPotterSales = keyboard.nextInt();

        System.out.printf("\nSales amount for Life of Pi: $%.2f\n", bookLifeOfPi.calculateSales(lifeOfPiSales));
        System.out.printf("Sales amount for Harry Potter: Goblet of Fire: $%.2f\n", bookHarryPotter.calculateSales(harryPotterSales));

        System.out.println("\nPercentage increase in Life of Pi book? (0 - 100)");
        double lifeOfPiIncrease = keyboard.nextDouble() / 100;

        System.out.println("Percentage increase in Harry Potter: Goblet of Fire book? (0 - 100)");
        double harryPotterIncrease = keyboard.nextDouble() / 100;

        bookLifeOfPi.increasePrice(lifeOfPiIncrease);
        System.out.printf("\nSales amount for Life of Pi after Percentage increase: $%.2f\n", bookLifeOfPi.calculateSales(lifeOfPiSales));

        bookHarryPotter.increasePrice(harryPotterIncrease);
        System.out.printf("Sales amount for Harry Potter: Goblet of Fire after Percentage increase: $%.2f\n",
                bookHarryPotter.calculateSales(harryPotterSales));

        keyboard.close();
    }

}
