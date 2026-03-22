package com.abstraction;

 public class Main {
    public static void main(String[] args) {

        SmartDevice myLight = new Light();
        myLight.turnOn();

        Vehicle myCar = new Car();
        myCar.rent();

        Payment myPay = new UPI();
        myPay.pay(500.0);
    }
}