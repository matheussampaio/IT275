package edu.iltuitk275.assignment5.msanto2;

import java.util.Random;

/**
 * The Class Dueler.
 */
public class Dueler {

    /** The Name of the dueler. */
    private String mName;

    /** The Prob to hit the target. */
    private double mProb;

    /** If the dueler is alive. */
    private boolean mIsAlive;

    /**
     * Instantiates a new dueler.
     *
     * @param name the name of the dueler
     * @param prob the prob to hit the target
     */
    public Dueler(String name, double prob) {
        setName(name);
        setProb(prob);

        setIsAlive(true);
    }

    /**
     * Shoot at target with mProb percentage to hit.
     *
     * @param target the target
     * @return true, if successful
     */
    public boolean shootAtTarget(Dueler target) {
        Random randomGenerator = new Random();

        boolean hit = randomGenerator.nextFloat() <= mProb;

        if (hit) {
            target.setIsAlive(false);
        }

        return hit;
    }

    /**
     * Checks if is alive.
     *
     * @return true, if is alive
     */
    public boolean isAlive() {
        return mIsAlive;
    }

    /**
     * Sets the dueler to alive or dead.
     *
     * @param isAlive the new checks if is alive
     */
    public void setIsAlive(boolean isAlive) {
        mIsAlive = isAlive;
    }

    /**
     * Gets the dueler name.
     *
     * @return the name
     */
    public String getName() {
        return mName;
    }

    /**
     * Sets the dueler name.
     *
     * @param name the new name
     */
    private void setName(String name) {
        mName = name;
    }

    /**
     * Gets the prob to hit the target.
     *
     * @return the prob
     */
    public double getProb() {
        return mProb;
    }

    /**
     * Sets the prob to hit the target.
     *
     * @param prob the new prob
     */
    public void setProb(double prob) {
        mProb = prob;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((mName == null) ? 0 : mName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(mProb);
        result = (prime * result) + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Dueler other = (Dueler) obj;
        if (mName == null) {
            if (other.mName != null) {
                return false;
            }
        } else if (!mName.equals(other.mName)) {
            return false;
        }
        if (Double.doubleToLongBits(mProb) != Double.doubleToLongBits(other.mProb)) {
            return false;
        }
        return true;
    }

}
