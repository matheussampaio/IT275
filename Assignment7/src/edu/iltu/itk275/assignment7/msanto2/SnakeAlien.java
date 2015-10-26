/*
 *  Filename:  SnakeAlien.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 19, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment7.msanto2;

/**
 * The Class SnakeAlien.
 *
 * @author matheussampaio
 */
public class SnakeAlien extends Alien {

    /**
     * Instantiates a new Snake Alien.
     *
     * @param name the name of the alien
     * @param health the health of the alien
     */
    public SnakeAlien(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 10;
    }

}
