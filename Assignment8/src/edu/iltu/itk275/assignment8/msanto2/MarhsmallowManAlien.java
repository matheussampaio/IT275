/*
 *  Filename:  MarhsmallowManAlien.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 19, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment8.msanto2;

/**
 * The Class MarhsmallowManAlien.
 */
public class MarhsmallowManAlien extends Alien {

    /**
     * Instantiates a new Marhsmallow Man Alien.
     *
     * @param name the name of the alien
     * @param health the health of the alien
     */
    public MarhsmallowManAlien(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 1;
    }

}
