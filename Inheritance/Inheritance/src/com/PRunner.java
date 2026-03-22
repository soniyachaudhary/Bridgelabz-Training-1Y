package com;

public class PRunner {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(120, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda");

        ev.displayDetails();
        ev.charge();

        System.out.println("------");

        pv.displayDetails();
        pv.refuel();
    }
}