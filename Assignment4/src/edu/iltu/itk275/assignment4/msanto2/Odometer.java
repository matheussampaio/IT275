package edu.iltu.itk275.assignment4.msanto2;

/**
 * The Class Odometer.
 */
public class Odometer {

    /** The Total miles. */
    private double mTotalMiles;

    /** The Fuel efficiency. */
    private double mFuelEfficiency;

    /**
     * Instantiates a new Odometer.
     *
     * @param efficiency the efficiency
     */
    public Odometer(double efficiency) {
        mTotalMiles = 0;
        mFuelEfficiency = efficiency;
    }

    /**
     * Reset the Odometer.
     */
    public void resetMiles() {
        mTotalMiles = 0;
    }

    /**
     * Sets the fuel efficiency.
     *
     * @param efficiency the new fuel efficiency
     */
    public void setFuelEfficiency(double efficiency) {
        mFuelEfficiency = efficiency;
    }

    /**
     * Adds miles.
     *
     * @param miles the miles
     */
    public void addMiles(double miles) {
        mTotalMiles = miles;
    }

    /**
     * Gets the gallons consumed.
     *
     * @return the gallons
     */
    public double getGallons() {
        return mTotalMiles / mFuelEfficiency;
    }

    /**
     * Gets the fuel efficiency.
     *
     * @return the fuel efficiency
     */
    public double getFuelEfficiency() {
        return mFuelEfficiency;
    }

    /**
     * Gets the total miles.
     *
     * @return the total miles
     */
    public double getTotalMiles() {
        return mTotalMiles;
    }
}
