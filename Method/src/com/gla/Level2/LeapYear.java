package com.gla.Level2;

import java.util.Scanner;

public class LeapYear {

    public static void checkLeap(int year) {
        if (year < 1582) {
            System.out.println("Leap year calculation starts from 1582.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        checkLeap(y);
    }
}
