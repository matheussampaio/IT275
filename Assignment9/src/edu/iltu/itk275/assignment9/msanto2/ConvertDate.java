/*
 *  Filename:  ConvertDate.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 26, 2015
 *
 *  Class: IT275
 *
 */
package edu.iltu.itk275.assignment9.msanto2;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * The Class ConvertDate.
 */
public class ConvertDate {

    /** The m date. */
    private GregorianCalendar mDate;

    /**
     * Instantiates a new convert date.
     *
     * @param month the month
     * @param day the day
     * @param year the year
     * @throws MonthException the month exception
     * @throws YearException the year exception
     * @throws DayException the day exception
     */
    public ConvertDate(int month, int day, int year) throws MonthException, YearException, DayException {
        if ((month < 1) || (month > 12)) {
            throw new MonthException(month);
        }
        if ((year < 1000) || (year >= 3000)) {
            throw new YearException(year);
        }
        if ((day < 1) || (day > 31)) {
            throw new DayException(day);
        }

        mDate = new GregorianCalendar(year, month - 1, 1);

        if (day > mDate.getActualMaximum(GregorianCalendar.DAY_OF_MONTH)) {
            throw new DayException(day);
        }

        mDate.set(GregorianCalendar.DAY_OF_MONTH, day);
    }

    /**
     * Gets the day.
     *
     * @return the day
     */
    public int getDay() {
        return mDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public String getMonth() {
        Locale euaLocale = new Locale("en_US", "United States");

        return mDate.getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.LONG, euaLocale);
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear() {
        return mDate.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString() {
        return String.format("%s %d, %d", getMonth(), getDay(), getYear());
    }

}
