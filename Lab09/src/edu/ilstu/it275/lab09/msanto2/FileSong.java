/*
 *  Filename:  FileSong.java
 *
 *  Programmer: Matheus Sampaio
 *  ULID: msanto2
 *
 *  Date: Oct 26, 2015
 *
 *  Class: IT275
 *
 */
package edu.ilstu.it275.lab09.msanto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Class FileSong.
 */
public class FileSong {

    /** The filepath. */
    private String mFilepath;

    /** The file. */
    private BufferedReader mFile;

    /**
     * Instantiates a new file song.
     *
     * @param filepath the filepath
     */
    public FileSong(String filepath) {
        mFilepath = filepath;
    }

    /**
     * Open Collection, for each title and artist, create a song instance and print.
     */
    public void load() {
        try {
            mFile = new BufferedReader(new FileReader(mFilepath));

            String songTitle = mFile.readLine();
            String songArtist = mFile.readLine();

            while ((songTitle != null) && (songArtist != null)) {
                Song song = new Song(songTitle, songArtist);

                System.out.println(song);

                songTitle = mFile.readLine();
                songArtist = mFile.readLine();
            }

            mFile.close();

        } catch (FileNotFoundException e) {
            System.err.println("Filepath not found.");
        } catch (IOException e) {
            System.err.println("Erro reading the collection file.");
        }
    }

}
