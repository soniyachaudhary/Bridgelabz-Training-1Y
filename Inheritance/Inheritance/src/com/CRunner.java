package com;
public class CRunner {
    public static void main(String[] args) {

        PaidOnlineCourse c1 = new PaidOnlineCourse(
                "Java Course",
                40,
                "Udemy",
                true,
                2000,
                20
        );

        c1.displayDetails();
    }
}
