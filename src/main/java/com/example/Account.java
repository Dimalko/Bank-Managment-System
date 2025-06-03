package com.example;

public class Account {
    private String accountId;
    private String clientName;
    private double balance;

    public Account(String accountId, String clientName) {
        this.accountId = accountId;
        this.clientName = clientName;
        this.balance = 0.0;
    }

    public void displayAccountDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Client Name: " + clientName);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }
}
