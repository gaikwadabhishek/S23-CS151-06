package hw1.Q3;

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<BankAccount> listOfAccounts;

    public AccountManager() {};

    public AccountManager(ArrayList<BankAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }

    public void createAccount(String name) {
        BankAccount newAccount = new BankAccount();
        this.listOfAccounts.add(newAccount);
        newAccount.setAccountNumber(listOfAccounts.indexOf(newAccount));
        newAccount.setName(name);
        newAccount.setBalance(0);
    }

    public void delete(BankAccount account) {
        listOfAccounts.remove(listOfAccounts.indexOf(account));
    }

    // Deposit
    public void deposit(BankAccount account, float amt) {
        if (amt > 0) {
            float addedBalance = account.getBalance() + amt;
            account.setBalance(addedBalance);
        }        
    }   
    
    // Withdraw
    public void withdraw(BankAccount account, float amt) {
        if (account.getBalance() - amt >= 0) {
            float withdrewBalance = account.getBalance() - amt;
            account.setBalance(withdrewBalance);
        }
    }   
}
