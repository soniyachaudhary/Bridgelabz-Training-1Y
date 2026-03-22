package com.gla;

public class Runner {
    public static void main(String[] args) {

        Vehicle v1 = new Car("C101", "Ram", 15);
        Vehicle v2 = new Bike("B101", "Anku", 8);
        Vehicle v3 = new Auto("A101", "Surii", 10);

        double distance = 10;

        System.out.println("Car Fare: " + v1.calculateFare(distance));
        System.out.println("Bike Fare: " + v2.calculateFare(distance));
        System.out.println("Auto Fare: " + v3.calculateFare(distance));

        System.out.println("\nVehicle Details:");
        v1.getVehicleDetails();
        v2.getVehicleDetails();
        v3.getVehicleDetails();
    }
}
