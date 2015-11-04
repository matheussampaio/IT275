/*
 *  Filename:  NameCollection.java
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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Class NameCollection.
 */
public class NameCollection {

    /** The names. */
    private NamePopularity[] mNames;

    /**
     * Instantiates a new name collection.
     *
     * @param filename the filename
     */
    public NameCollection(String filename) {
        mNames = new NamePopularity[1000];

        load(filename);
    }

    private void load(String filename) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line = bufferedReader.readLine();

            int index = 0;

            while (line != null) {
                String[] split = line.split(" ");

                String name = split[0];
                int popularity = Integer.parseInt(split[1]);

                mNames[index] = new NamePopularity(name, popularity, index + 1);

                index++;
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the names.
     *
     * @return the names
     */
    private NamePopularity[] getNames() {
        return mNames;
    }

    /**
     * Search.
     *
     * @param name the name
     * @return the name popularity
     */
    public NamePopularity search(String name) {
        for (NamePopularity np : mNames) {
            if (np.getName().equalsIgnoreCase(name)) {
                return np;
            }
        }

        return null;
    }

}
