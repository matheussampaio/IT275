/*
 *  Filename:  AlienPack.java
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
 * The Class AlienPack.
 */
public class AlienPack {

    /** The aliens. */
    private Alien[] mAliens;

    /**
     * Instantiates a new alien pack.
     *
     * @param size size of the pack
     */
    public AlienPack(int size) {
        mAliens = new Alien[size];
    }

    /**
     * Adds the alien.
     *
     * @param alien the alien
     * @param index the index
     */
    public void addAlien(Alien alien, int index) {
        mAliens[index] = alien;
    }

    /**
     * Gets the aliens.
     *
     * @return the aliens
     */
    public Alien[] getAliens() {
        return mAliens;
    }

    /**
     * Calculate damage.
     *
     * @return damage amount of the pack
     */
    public int calculateDamage() {
        int damage = 0;

        for (Alien alien : mAliens) {
            damage += alien.getDamage();
        }

        return damage;
    }
}
