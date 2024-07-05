package com.example.bunga_bank;

public class AccountTest {
    public static void main(String[] args) {
        // Instantiate a CheckingAccount object
        CheckingAccount account = new CheckingAccount(1000000.0, "John Doe");
        LoanBills bonds = new LoanBills();

        // Output the initial balance and name
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Account Holder: " + account.getName());

        // Test withdraw method
        System.out.println("\nWithdrawing Rp500.000...");
        account.withdraw(500000.0);

        System.out.println("\nWithdrawing Rp271.000.000.000.000...");
        account.withdraw(271000000000000.0);

        System.out.println("\nWithdrawing -Rp7.000.000...");
        account.withdraw(-7000000.0);

        bonds.showInterest(100000, 2, account.getBalance());
        ;

    }
}