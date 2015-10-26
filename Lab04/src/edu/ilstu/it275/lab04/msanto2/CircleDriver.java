package edu.ilstu.it275.lab04.msanto2;

import java.util.Scanner;

public class CircleDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the radius?");
        int radius = keyboard.nextInt();

        Circle circle = new Circle(radius);

        System.out.printf("Circle area: %.2f\n", circle.calculateArea());
        System.out.printf("Circle diameter: %.2f\n", circle.calculateDiameter());
        System.out.printf("Circle circumference: %.2f\n", circle.calculateCircumference());

        keyboard.close();
    }
}
