/*
 *  Filename:  Main.java
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
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Alien snakeAllien = new SnakeAlien("Snake 1", 100);
        Alien ogreAllien = new OgreAlien("Ogre 1", 100);
        Alien mashManAllien = new MarhsmallowManAlien("Mashsmallow Man 1", 100);

        AlienPack alienPack = new AlienPack(3);

        alienPack.addAlien(snakeAllien, 0);
        alienPack.addAlien(ogreAllien, 1);
        alienPack.addAlien(mashManAllien, 2);

        System.out.println("Alien Pack damage: " + alienPack.calculateDamage());
    }

}
