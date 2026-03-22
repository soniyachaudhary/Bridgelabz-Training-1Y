package com.abstraction;

interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented for 24 hours");
    }
    public void returnVehicle() {
        System.out.println("Car returned to garage");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented for 5 hours");
    }
    public void returnVehicle() {
        System.out.println("Bike parked back at station");
    }
}