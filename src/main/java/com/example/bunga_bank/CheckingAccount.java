package com.example.bunga_bank;

public class CheckingAccount {
    private double balance;
    private String name;

    public CheckingAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Warning: Withdrawal amount cannot be negative. Your balance: " + balance);
        } else if (amount > balance) {
            System.out.println(
                    "Warning: Insufficient funds. Balance is too low for withdrawal. your balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}