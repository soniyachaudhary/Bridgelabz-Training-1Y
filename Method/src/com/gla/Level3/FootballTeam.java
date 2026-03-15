package com.gla.Level3;
import java.util.Scanner;

public class FootballTeam {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        System.out.println("Generated Heights:");
        for (int i = 0; i < 11; i++) {
            heights[i] = (int)(Math.random() * (250 - 150 + 1) + 150);
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n\nShortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + String.format("%.2f", findMean(heights)));
    }
}