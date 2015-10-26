/*
 *  Filename:  Alien.java
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
 * The Class Alien.
 */
public abstract class Alien {

    /** The health. */
    private int mHealth;

    /** The name. */
    private String mName;

    /**
     * Instantiates a new alien.
     *
     * @param name the name of the alien
     * @param health the health of the alien
     */
    public Alien(String name, int health) {
        setHealth(health);
        setName(name);
    }

    /**
     * Gets the health.
     *
     * @return the health
     */
    public int getHealth() {
        return mHealth;
    }

    /**
     * Sets the health.
     *
     * @param health the new health
     */
    public void setHealth(int health) {
        mHealth = health;
    }

    /**
     * Gets the name of the alien.
     *
     * @return the name of the alien
     */
    public String getName() {
        return mName;
    }

    /**
     * Sets the name of the alien.
     *
     * @param name the new name of the alien
     */
    public void setName(String name) {
        mName = name;
    }

    /**
     * Gets the damage.
     *
     * @return the damage
     */
    public abstract int getDamage();

}
