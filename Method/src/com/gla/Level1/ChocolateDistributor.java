package com.gla.Level1;
import java.util.Scanner;

public class ChocolateDistributor {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + results[0]);
        System.out.println("Remaining chocolates: " + results[1]);
    }
}