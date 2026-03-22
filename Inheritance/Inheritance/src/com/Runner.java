package com;

public class Runner{
    public static void main(String[] args) {

        Employee e1 = new Manager("Rimjim", 101, 50000, 5);
        Employee e2 = new Developer("shivam", 102, 40000, "Java");
        Employee e3 = new Intern("Soniya", 103, 15000, 6);

        e1.displayDetails();
        System.out.println("------");

        e2.displayDetails();
        System.out.println("------");

        e3.displayDetails();
    }
}