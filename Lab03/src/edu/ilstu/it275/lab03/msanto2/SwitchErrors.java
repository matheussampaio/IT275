/*
 * Filename:  SwitchErrors.java
 *
 * Programmer: Matheus Sampaio
 * ULID: msanto2
 *
 * Date: 08/31/2015
 *
 * Class: IT275
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:
 */
package edu.ilstu.it275.lab03.msanto2;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author matheussampaio
 *
 */
public class SwitchErrors {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Key:  1=blue, 2=red, 3=green");
        System.out.print("Enter a number and I'll return ");
        System.out.print(" the corresponding color.  ");

        int number = keyboard.nextInt();

        switch (number) {
        case 1:
            System.out.println("You chose blue!");
            break;
        case 2:
            System.out.println("You chose red!");
            break;
        case 3:
            System.out.println("You chose green!");
        default:
            System.out.println("Color not available!");
            break;
        }
    }

}
