package com.gla.Level1;
class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("Samsung", "Galaxy S23", 75000);
        MobilePhone p2 = new MobilePhone("Apple", "iPhone 15", 80000);

        p1.showDetails();
        System.out.println("-----------------");
        p2.showDetails();
    }
}