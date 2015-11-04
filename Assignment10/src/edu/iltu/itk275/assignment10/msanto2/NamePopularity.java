/*
 *  Filename:  NamePopularity.java
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

/**
 * The Class NamePopularity.
 */
public class NamePopularity {

    /** The name. */
    private final String mName;

    /** The quantity. */
    private final int mQuantity;

    /** The rank. */
    private final int mRank;

    /**
     * Instantiates a new name popularity.
     *
     * @param name the name
     * @param quantity the quantity
     * @param rank the rank
     */
    public NamePopularity(String name, int quantity, int rank) {
        mName = name;
        mQuantity = quantity;
        mRank = rank;
    }

    /**
     * Gets the quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return mQuantity;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the rank.
     *
     * @return the rank
     */
    public int getRank() {
        return mRank;
    }

}
