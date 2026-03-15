package com.gla.Level2;

import java.util.Scanner;

public class NumberLogic {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " is Positive and Even");
                else System.out.println(n + " is Positive and Odd");
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int res = compare(nums[0], nums[4]);
        if (res == 1) System.out.println("First element is greater than last");
        else if (res == 0) System.out.println("First and last are equal");
        else System.out.println("First element is less than last");
    }
}
