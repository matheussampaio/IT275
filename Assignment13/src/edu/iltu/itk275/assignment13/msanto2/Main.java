/*
 *  Filename:  Main.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Nov 17, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment13.msanto2;

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
        Shape circle = new Circle(15);
        System.out.println(String.format("Circle area: %.2f", circle.area()));

        Shape square = new Square(20);
        System.out.println(String.format("Square area: %.2f", square.area()));

        Shape retangle = new Retangle(10, 20);
        System.out.println(String.format("Retangle area: %.2f", retangle.area()));

    }

}
