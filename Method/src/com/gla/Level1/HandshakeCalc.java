package com.gla.Level1;
import java.util.Scanner;

    public class HandshakeCalc {

        public static int findHandshakes(int n) {
            return (n * (n - 1)) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();

            int total = findHandshakes(numberOfStudents);

            System.out.println("The number of possible handshakes is: " + total);
        }
    }
