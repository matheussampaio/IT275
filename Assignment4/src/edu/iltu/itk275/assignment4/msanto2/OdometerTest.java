package edu.iltu.itk275.assignment4.msanto2;

public class OdometerTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        System.out.println("Creating odometer with efficiency equal to 5.");
        Odometer odometer = new Odometer(5);

        System.out.println("Adding 100 miles.");
        System.out.println("Miles before: " + odometer.getTotalMiles());
        odometer.addMiles(100);
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Reseting miles.");
        odometer.resetMiles();
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Adding 200 miles.");
        System.out.println("Miles before: " + odometer.getTotalMiles());
        odometer.addMiles(200);
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Gallons consumed: " + odometer.getGallons());
    }

    public static void test2() {
        System.out.println("Creating odometer with efficiency equal to 1.");
        Odometer odometer = new Odometer(1);

        System.out.println("Adding 500 miles.");
        System.out.println("Miles before: " + odometer.getTotalMiles());
        odometer.addMiles(500);
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Reseting miles.");
        odometer.resetMiles();
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Adding 350 miles.");
        System.out.println("Miles before: " + odometer.getTotalMiles());
        odometer.addMiles(350);
        System.out.println("Miles after: " + odometer.getTotalMiles());

        System.out.println("Gallons consumed: " + odometer.getGallons());
    }

}
