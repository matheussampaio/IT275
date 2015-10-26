package edu.iltuitk275.assignment5.msanto2;

import java.util.ArrayList;

/**
 * The Class Main.
 */
public class Main {

    /** The Constant AARON_NAME. */
    private static final String AARON_NAME = "Aaron";

    /** The Constant BOB_NAME. */
    private static final String BOB_NAME = "Bob";

    /** The Constant CHARLIE_NAME. */
    private static final String CHARLIE_NAME = "Charlie";

    /** The Constant AARON_PROB. */
    private static final double AARON_PROB = 1.0 / 3.0;

    /** The Constant BOB_PROB. */
    private static final double BOB_PROB = 1.0 / 2.0;

    /** The Constant CHARLIE_PROB. */
    private static final double CHARLIE_PROB = 1.0;

    /** The Constant NUMBER_OF_SIMULATIONS. */
    private static final int NUMBER_OF_SIMULATIONS = 1000;

    /**
     * The main method.
     */
    public static void main(String[] args) {
        useStrategyOne();
        useStrategyTwo();
    }

    /**
     * Use strategy one.
     */
    public static void useStrategyOne() {
        int aaron_wins = 0;
        int bob_wins = 0;
        int charlie_wins = 0;

        System.out.println("Using strategy One:\n");

        for (int i = 0; i < NUMBER_OF_SIMULATIONS; i++) {
            String winner = strategyOne();

            if (winner.equals(AARON_NAME)) {
                aaron_wins++;
            } else if (winner.equals(BOB_NAME)) {
                bob_wins++;
            } else if (winner.equals(CHARLIE_NAME)) {
                charlie_wins++;
            }
        }

        System.out.printf("Aaron won %.1f%%.\n", ((aaron_wins * 100.0) / NUMBER_OF_SIMULATIONS));
        System.out.printf("Bob won %.1f%%.\n", ((bob_wins * 100.0) / NUMBER_OF_SIMULATIONS));
        System.out.printf("Charlie won %.1f%%.\n\n\n", ((charlie_wins * 100.0) / NUMBER_OF_SIMULATIONS));
    }

    /**
     * Use strategy two.
     */
    public static void useStrategyTwo() {
        int aaron_wins = 0;
        int bob_wins = 0;
        int charlie_wins = 0;

        System.out.println("Using strategy Two:\n");

        for (int i = 0; i < NUMBER_OF_SIMULATIONS; i++) {
            String winner = strategyTwo();

            if (winner.equals(AARON_NAME)) {
                aaron_wins++;
            } else if (winner.equals(BOB_NAME)) {
                bob_wins++;
            } else if (winner.equals(CHARLIE_NAME)) {
                charlie_wins++;
            }
        }

        System.out.printf("Aaron won %.1f%%.\n", ((aaron_wins * 100.0) / NUMBER_OF_SIMULATIONS));
        System.out.printf("Bob won %.1f%%.\n", ((bob_wins * 100.0) / NUMBER_OF_SIMULATIONS));
        System.out.printf("Charlie won %.1f%%.\n", ((charlie_wins * 100.0) / NUMBER_OF_SIMULATIONS));
    }

    /**
     * Strategy one.
     *
     * @return the winner
     */
    public static String strategyOne() {
        Dueler aaron = new Dueler(AARON_NAME, AARON_PROB);
        Dueler bob = new Dueler(BOB_NAME, BOB_PROB);
        Dueler charlie = new Dueler(CHARLIE_NAME, CHARLIE_PROB);

        ArrayList<Dueler> duelers = new ArrayList<Dueler>();

        duelers.add(aaron);
        duelers.add(bob);
        duelers.add(charlie);

        return simulateDuel(duelers);
    }

    /**
     * Strategy two.
     *
     * @return the winner
     */
    public static String strategyTwo() {
        Dueler aaron = new DuelerModified(AARON_NAME, AARON_PROB);
        Dueler bob = new Dueler(BOB_NAME, BOB_PROB);
        Dueler charlie = new Dueler(CHARLIE_NAME, CHARLIE_PROB);

        ArrayList<Dueler> duelers = new ArrayList<Dueler>();

        duelers.add(aaron);
        duelers.add(bob);
        duelers.add(charlie);

        return simulateDuel(duelers);
    }

    /**
     * Simulate duel.
     *
     * @param duelers the duelers
     * @return the winner
     */
    public static String simulateDuel(ArrayList<Dueler> duelers) {

        // The shooter keeps going until we have only one dueler alive.
        while (duelers.size() > 1) {

            // The first dueler is always the current shooter.
            Dueler turn = duelers.get(0);

            // The best dueler start after the current shooter, so index 1.
            Dueler bestDuelerDifferentFromTurn = duelers.get(1);

            // Then we iterate from 2 until the end of the array to find the best target.
            for (int i = 2; i < duelers.size(); i++) {
                Dueler tempDueler = duelers.get(i);

                if (tempDueler.getProb() > bestDuelerDifferentFromTurn.getProb()) {
                    bestDuelerDifferentFromTurn = tempDueler;
                }
            }

            // Shoot at the target
            boolean isTargetDead = turn.shootAtTarget(bestDuelerDifferentFromTurn);

            // If target is dead, remove from duelers.
            if (isTargetDead) {
                duelers.remove(bestDuelerDifferentFromTurn);
            }

            // Move the dueler to the end of the line.
            duelers.add(duelers.remove(0));
        }

        // The last dueler is the winner.
        String winner = duelers.get(0).getName();

        return winner;
    }

}
