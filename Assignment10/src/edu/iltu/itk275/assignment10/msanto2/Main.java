/*
 *  Filename:  Main.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Nov 3, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment10.msanto2;

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
        NameCollection boysCollection = new NameCollection("boynames.txt");
        NameCollection girlsCollection = new NameCollection("girlnames.txt");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name?");
        String name = keyboard.nextLine();

        NamePopularity boyName = boysCollection.search(name);

        if (boyName != null) {
            String template = "%s is ranked %d in popularity among boys with %d boys receiving the name";
            String output = String.format(template, boyName.getName(), boyName.getRank(), boyName.getQuantity());
            System.out.println(output);
        } else {
            System.out.println(String.format("%s is not ranked among the top 1,000 boys names", name));
        }

        NamePopularity girlName = girlsCollection.search(name);

        if (girlName != null) {
            String template = "%s is ranked %d in popularity among girls with %d girls receiving the name";
            String output = String.format(template, girlName.getName(), girlName.getRank(), girlName.getQuantity());
            System.out.println(output);
        } else {
            System.out.println(String.format("%s is not ranked among the top 1,000 girls names", name));
        }

        keyboard.close();
    }

}
