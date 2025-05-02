import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bank that manages multiple accounts
 */
public class Bank {
    private String bankName;
    private List<Account> accounts;
    private int nextAccountNumber;
    
    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1001; // Starting account number
    }
    
    public Account createAccount(String accountHolder, double initialBalance, String accountType) {
        Account newAccount = new Account(nextAccountNumber, accountHolder, initialBalance, accountType);
        accounts.add(newAccount);
        nextAccountNumber++;
        System.out.println("Account created successfully!");
        return newAccount;
    }
    
    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    
    public void listAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found in " + bankName);
            return;
        }
        
        System.out.println("\n--- Accounts at " + bankName + " ---");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("-----------------------------\n");
    }
    
    public String getBankName() {
        return bankName;
    }
}