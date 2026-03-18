package com.gla.Level1;

public class BankApp{

    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();

        double principal = 10000;
        double rate = 5;   // 5%
        double time = 2;   // 2 years
        double si = ic.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest = " + si);
        double ci = principal * (Math.pow((1 + rate / 100), time)) - principal;
        System.out.println("Compound Interest = " + ci);
    }
}