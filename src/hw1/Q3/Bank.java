package hw1.Q3;

import java.util.prefs.BackingStoreException;
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        BankAccount account1 = new BankAccount(1, "Trique", 0);
        BankAccount account2 = new BankAccount(2, "Banh Mi", 10);
        BankAccount account3 = new BankAccount(3, "Pho", 30);
        BankAccount account4 = new BankAccount(4, "Bot", 10);
        BankAccount account5 = new BankAccount(5, "Gong", 30);

        accountManager.create(account1);
        accountManager.create(account2);
        accountManager.create(account3);
        accountManager.create(account4);
        accountManager.create(account5);

        account1.deposit(100);
        account1.withdraw(20);          // balance = 80

        account2.deposit(10);
        account2.withdraw(20);          // balance = 0

        account3.deposit(20);
        account3.withdraw(0);           // balance = 50

        account4.deposit(34);
        account4.withdraw((float) 20.5);     // balance = 23.5

        account5.deposit((float) 0.5);
        account5.withdraw(10);          // balance = 20.5

        account5.transfer(account2, 5); // balance: account5 = 15.5, account2 = 5

        System.out.println("Testing BankAccount deposit, withdraw, transfer and AccountManager listOfAccounts, create");
        for (BankAccount acc : accountManager.getListOfAccounts()) {
            System.out.println("Account " + acc.getAccountNumber() + " [account_number = " + acc.getAccountNumber() + ", name = " + acc.getName() + ", balance = " + acc.getBalance());
        }

        accountManager.deposit(account1, 400);  // balance = 480
        accountManager.withdraw(account3, 20);  // balance = 30
        accountManager.delete(account4);
        accountManager.delete(account2);

        System.out.println("Testing AccountManager deposit, withdraw, delete");
        for (BankAccount acc : accountManager.getListOfAccounts()) {
            System.out.println("Account " + acc.getAccountNumber() + " [account_number = " + acc.getAccountNumber() + ", name = " + acc.getName() + ", balance = " + acc.getBalance());
        }
    }
}
