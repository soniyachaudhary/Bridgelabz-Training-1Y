package com.Exception;
public class InterestCalculator {

    public static void main(String[] args) {
        double testAmount = -1000;
        double testRate = 5.5;
        int testYears = 2;

        try {
            double interest = calculateInterest(testAmount, testRate, testYears);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {

            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }

    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Negative values not allowed");
        }

        return (amount * rate * years) / 100;
    }
}
