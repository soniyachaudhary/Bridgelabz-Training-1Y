package com.gla.Level2;

import java.util.Scanner;

public class FriendStats {

    public static String findYoungest(int[] ages, String[] names) {
        int min = ages[0];
        String name = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < min) {
                min = ages[i];
                name = names[i];
            }
        }
        return name;
    }

    public static String findTallest(double[] heights, String[] names) {
        double max = heights[0];
        String name = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > max) {
                max = heights[i];
                name = names[i];
            }
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest friend is: " + findYoungest(ages, names));
        System.out.println("Tallest friend is: " + findTallest(heights, names));
    }
}