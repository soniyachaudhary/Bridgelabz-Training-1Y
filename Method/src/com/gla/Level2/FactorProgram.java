package com.gla.Level2;
    import java.util.Scanner;

    public class FactorProgram {

        public static int[] getFactors(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors[index] = i;
                    index++;
                }
            }
            return factors;
        }

        public static int findSum(int[] arr) {
            int s = 0;
            for (int x : arr) {
                s += x;
            }
            return s;
        }

        public static long findProduct(int[] arr) {
            long p = 1;
            for (int x : arr) {
                p *= x;
            }
            return p;
        }

        public static double findSumSquares(int[] arr) {
            double sumSq = 0;
            for (int x : arr) {
                sumSq += Math.pow(x, 2);
            }
            return sumSq;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int[] factors = getFactors(num);

            System.out.print("Factors are: ");
            for (int f : factors) {
                System.out.print(f + " ");
            }

            System.out.println("\nSum of factors: " + findSum(factors));
            System.out.println("Product of factors: " + findProduct(factors));
            System.out.println("Sum of square of factors: " + findSumSquares(factors));
        }
    }

