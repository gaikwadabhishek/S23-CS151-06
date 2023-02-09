package hw1.Q3;

public class BankAccount {
    private int accountNumber; 
    private String name;
    private float balance;

    public BankAccount() {}

    public BankAccount(int accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amt) {
        if (amt > 0) {
            this.balance += amt;
        } else {
            System.out.println("Please deposit a valid amount");
        }
        
    }

    public void withdraw(float amt) {
        if (this.balance - amt >= 0) {
            this.balance -= amt;
        }        
    }

    public void transfer(BankAccount account, float amt) {
        if (this.balance - amt >= 0) {
            this.balance -= amt;
            account.balance += amt;
        }
    }
}
