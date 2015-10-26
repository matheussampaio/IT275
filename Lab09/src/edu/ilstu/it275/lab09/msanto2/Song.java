/*
 *  Filename:  Song.java
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

/**
 * The Class Song.
 */
public class Song {

    /** The title. */
    private String mTitle;

    /** The artist. */
    private String mArtist;

    /**
     * Instantiates a new song.
     *
     * @param title the title
     * @param artist the artist
     */
    public Song(String title, String artist) {
        setTitle(title);
        setArtist(artist);
    }

    /**
     * Gets the artist.
     *
     * @return the artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Sets the artist.
     *
     * @param artist the new artist
     */
    public void setArtist(String artist) {
        mArtist = artist;
    }

    /**
     * Gets the title.
     *
     * @return the title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Sets the title.
     *
     * @param title the new title
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public String toString() {
        return String.format("%s by %s", getTitle(), getArtist());
    }

}
