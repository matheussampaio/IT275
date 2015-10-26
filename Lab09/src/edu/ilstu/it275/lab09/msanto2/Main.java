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
package edu.ilstu.it275.lab09.msanto2;

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
        FileSong fileSong = new FileSong("Collection.txt");

        fileSong.load();
    }

}
