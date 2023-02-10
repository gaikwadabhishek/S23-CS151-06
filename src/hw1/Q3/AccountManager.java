package hw1.Q3;

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<BankAccount> listOfAccounts = new ArrayList<>();

    public AccountManager() {};

    public AccountManager(ArrayList<BankAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }

    public ArrayList<BankAccount> getListOfAccounts() {
        return this.listOfAccounts;
    }

    public void setListOfAccounts(ArrayList<BankAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }

    public void create(BankAccount account) {
        this.listOfAccounts.add(account);
    }

    public void delete(BankAccount account) {
        this.listOfAccounts.remove(listOfAccounts.indexOf(account));
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
