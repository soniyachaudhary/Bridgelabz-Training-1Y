package com.gla.Level2;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String holder, long accNum, double initialBalance) {
        accountHolder = holder;
        accountNumber = accNum;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Error: Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("Suresh Raina", 123456789, 5000.0);

        myAcc.showBalance();
        myAcc.deposit(2000);
        myAcc.withdraw(1500);
        myAcc.showBalance();
        myAcc.withdraw(10000); // Check for insufficient balance
    }
}
