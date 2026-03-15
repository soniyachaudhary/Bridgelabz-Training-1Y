package com.gla.Level1;

import java.util.Scanner;

public class NumberComparison {

    public static void findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        // Finding largest
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        // Finding smallest
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        findSmallestAndLargest(n1, n2, n3);
    }
}
