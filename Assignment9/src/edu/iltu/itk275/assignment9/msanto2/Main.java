/*
 *  Filename:  Main.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 26, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment9.msanto2;

import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Date?");
        String dateString = keyboard.nextLine();

        int day, month, year;

        month = Integer.parseInt(dateString.split("/")[0]);
        day = Integer.parseInt(dateString.split("/")[1]);
        year = Integer.parseInt(dateString.split("/")[2]);

        ConvertDate convertDate = createDate(month, day, year, keyboard);

        System.out.println(convertDate);

        keyboard.close();
    }

    /**
     * Creates the date.
     *
     * @param month the month
     * @param day the day
     * @param year the year
     * @param keyboard the keyboard
     * @return the convert date
     */
    private static ConvertDate createDate(int month, int day, int year, Scanner keyboard) {
        try {
            ConvertDate convertDate = new ConvertDate(month, day, year);

            return convertDate;
        } catch (MonthException e) {
            System.out.println("The previous month is invalid. Enter the correct one:");
            month = keyboard.nextInt();
        } catch (DayException e) {
            System.out.println("The previous day is invalid. Enter the correct day:");
            day = keyboard.nextInt();
        } catch (YearException e) {
            System.out.println("The previous year is invalid. Enteger the correct year:");
            year = keyboard.nextInt();
        }

        return createDate(month, day, year, keyboard);
    }

}
