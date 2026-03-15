package com.gla.Level2;

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }

    void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit Kumar", 25, 85.5);
        s1.displayReport();
    }
}
