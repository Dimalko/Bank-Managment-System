package com.example;

import java.util.*;


public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountId, String clientName) {
        if (!accounts.containsKey(accountId)) {
            accounts.put(accountId, new Account(accountId, clientName));
            System.out.println("Account created for " + clientName + " with ID: " + accountId);
        } else {
            System.out.println("Account with ID " + accountId + " already exists.");
        }
    }

    public Account getAccount(String accountId) {
        return accounts.get(accountId);
    }

    public void deleteAccount(String accountId) {
        if (accounts.containsKey(accountId)) {
            accounts.remove(accountId);
            System.out.println("Account with ID " + accountId + " has been deleted.");
        } else {
            System.out.println("No account found with ID " + accountId);
        }
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts.values()) {
                account.displayAccountDetails();
                System.out.println("---------------------------");
            }
        }
    }
}
