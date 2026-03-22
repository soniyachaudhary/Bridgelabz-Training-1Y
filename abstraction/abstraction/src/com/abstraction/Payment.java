package com.abstraction;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI Scanner");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card Chip");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " from Digital Wallet");
    }
}