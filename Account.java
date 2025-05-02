// Account.java
/**
 * Represents a bank account with basic operations
 */
public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType; // "Savings" or "Current"
    
    // Constructor
    public Account(int accountNumber, String accountHolder, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
    }
    
    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Account operations
    /**
     * Deposits money into the account
     * @param amount The amount to be deposited
     * @return true if deposit is successful
     */
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive");
            return false;
        }
        
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
        System.out.println("New balance: $" + balance);
        return true;
    }
    
    /**
     * Withdraws money from the account
     * @param amount The amount to be withdrawn
     * @return true if withdrawal is successful
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Error: Insufficient funds");
            return false;
        }
        
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount);
        System.out.println("New balance: $" + balance);
        return true;
    }
    
    /**
     * Displays account information and current balance
     */
    public void checkBalance() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
        System.out.println("--------------------------\n");
    }
    
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Holder: " + accountHolder + 
               ", Type: " + accountType + 
               ", Balance: $" + balance;
    }
}