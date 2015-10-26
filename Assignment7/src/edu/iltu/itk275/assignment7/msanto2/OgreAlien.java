/*
 *  Filename:  OgreAlien.java
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
 * The Class OgreAlien.
 */
public class OgreAlien extends Alien {

    /**
     * Instantiates a new Ogre Alien.
     *
     * @param name the name of the alien
     * @param health the health of the alien
     */
    public OgreAlien(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 6;
    }

}
