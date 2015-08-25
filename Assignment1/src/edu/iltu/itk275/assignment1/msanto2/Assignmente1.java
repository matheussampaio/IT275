/**
 *
 */
package edu.iltu.itk275.assignment1.msanto2;

/**
 * The Class main.
 *
 * @author matheussampaio
 */
public class Assignmente1 {

    /**
     * Translate my name to pig latin and capitalized it.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
        String first = "matheus";
        String last = "sampaio";

        System.out.printf("%s %s\n", capitalize(getPigLatin(first)), capitalize(getPigLatin(last)));
    }

    /**
     * Translate word to pig latin.
     *
     * @param word
     *            the word to be translated.
     * @return the word in pig latin
     */
    private static String getPigLatin(String word) {
        String wordInPigLatin = word.substring(1) + word.charAt(0) + "ay";

        return wordInPigLatin;
    }

    /**
     * Capitalize the word.
     *
     * @param word
     *            the word to be capitalized.
     * @return the word capitalized.
     */
    private static String capitalize(String word) {
        return Character.toString(word.charAt(0)).toUpperCase() + word.substring(1);
    }

}
