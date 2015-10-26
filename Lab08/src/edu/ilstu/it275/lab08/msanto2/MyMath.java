package edu.ilstu.it275.lab08.msanto2;

public class MyMath {

    public static int divide(int numerator, int denominator) throws ZeroDenominatorException, NotEvenlyDivisibleException {
        if (denominator == 0) {
            throw new ZeroDenominatorException();
        } else if ((numerator % denominator) != 0) {
            throw new NotEvenlyDivisibleException(numerator, denominator);
        }

        return numerator / denominator;
    }

}
