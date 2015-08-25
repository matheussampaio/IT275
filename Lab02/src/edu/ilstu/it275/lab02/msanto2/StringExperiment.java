/**
 *
 */
package edu.ilstu.it275.lab02.msanto2;

/**
 * Some simple Strings Experiments.
 */
public class StringExperiment {

    /**
     * Manipulate and Print my full name.
     *
     * @param args
     */
    public static void main(String[] args) {
        String firstName = "Matheus";
        String middleName = "Santos";
        String lastName = "Sampaio";

        System.out.printf("%s %s %s\n", firstName, middleName, lastName);

        System.out.printf("%s %s. %s\n", firstName, middleName.charAt(0), lastName);

        System.out.printf("%s %s\n", firstName.toUpperCase(), lastName.toLowerCase());

        System.out.printf("Length of the last name = %d\n", lastName.length());

        char lastNameMiddleLetter = lastName.charAt(lastName.length() / 2);

        System.out.printf("%s\n", lastNameMiddleLetter);

        char firstNameLastLetter = firstName.charAt(firstName.length() - 1);

        System.out.printf("%s\n", firstNameLastLetter);
    }

}
