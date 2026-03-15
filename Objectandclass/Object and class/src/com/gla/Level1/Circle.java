package com.gla.Level1;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate() {
        double area = 3.14 * radius * radius;
        double circum = 2 * 3.14 * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circum);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        c1.calculate();
    }
}
