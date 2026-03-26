package com.Exception;

public class Practice2 {
    static void ageChecker(int a) throws ArithmeticException, NullPointerException {
        if (a > 18) {
            throw new ArithmeticException("Invalid age");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            ageChecker(10);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}



