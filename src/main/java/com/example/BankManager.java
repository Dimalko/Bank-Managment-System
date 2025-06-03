package com.example;

import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        while (true) {
            System.out.println("\nWelcome to the Bank Management System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Deposit Money");
            System.out.println("6. Withdraw Money");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    String accountId = scanner.nextLine();
                    System.out.print("Enter Client Name: ");
                    String clientName = scanner.nextLine();
                    bank.createAccount(accountId, clientName);
                    break;
                case 2:
                    System.out.print("Enter Account ID to view: ");
                    String viewId = scanner.nextLine();
                    Account account = bank.getAccount(viewId);
                    if (account != null) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("No account found with ID " + viewId);
                    }
                    break;
                case 3:
                    System.out.print("Enter Account ID to delete: ");
                    String deleteId = scanner.nextLine();
                    bank.deleteAccount(deleteId);
                    break;
                case 4:
                    bank.displayAllAccounts();
                    break;
                case 5:
                    System.out.print("Enter Account ID to deposit money: ");
                    String depositId = scanner.nextLine();
                    Account depositAccount = bank.getAccount(depositId);
                    if (depositAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("No account found with ID " + depositId);
                    }
                    break;
                case 6:
                    System.out.print("Enter Account ID to withdraw money: ");
                    String withdrawId = scanner.nextLine();
                    Account withdrawAccount = bank.getAccount(withdrawId);
                    if (withdrawAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found with ID " + withdrawId);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}