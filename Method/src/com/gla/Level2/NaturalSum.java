package com.gla.Level2;

import java.util.Scanner;

    public class NaturalSum {

        public static int sumRecursion(int n) {
            if (n <= 1) {
                return n;
            }
            return n + sumRecursion(n - 1);
        }

        public static int sumFormula(int n) {
            return (n * (n + 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                int r1 = sumRecursion(num);
                int r2 = sumFormula(num);

                System.out.println("Recursion Result: " + r1);
                System.out.println("Formula Result: " + r2);

                if (r1 == r2) {
                    System.out.println("Both match!");
                }
            } else {
                System.out.println("Not a natural number");
            }
        }
}
