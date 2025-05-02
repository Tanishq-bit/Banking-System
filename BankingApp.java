import java.util.Scanner;

/**
 * Main application to run the banking system
 */
public class BankingApp {
    private static Bank bank = new Bank("Java Bank");
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean exit = false;
        
        System.out.println("Welcome to " + bank.getBankName() + " Banking System!");
        
        while (!exit) {
            displayMainMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    createNewAccount();
                    break;
                case 2:
                    accessAccount();
                    break;
                case 3:
                    bank.listAllAccounts();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using " + bank.getBankName() + " Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Create New Account");
        System.out.println("2. Access Existing Account");
        System.out.println("3. List All Accounts");
        System.out.println("4. Exit");
        System.out.println("----------------");
    }
    
    private static void createNewAccount() {
        System.out.println("\n--- Create New Account ---");
        String name = getStringInput("Enter account holder name: ");
        double initialBalance = getDoubleInput("Enter initial deposit amount: ");
        
        System.out.println("Select account type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        int typeChoice = getIntInput("Enter your choice: ");
        
        String accountType;
        if (typeChoice == 1) {
            accountType = "Savings";
        } else if (typeChoice == 2) {
            accountType = "Current";
        } else {
            System.out.println("Invalid choice. Defaulting to Savings account.");
            accountType = "Savings";
        }
        
        Account newAccount = bank.createAccount(name, initialBalance, accountType);
        System.out.println("Your account number is: " + newAccount.getAccountNumber());
    }
    
    private static void accessAccount() {
        System.out.println("\n--- Access Account ---");
        int accountNumber = getIntInput("Enter account number: ");
        
        Account account = bank.findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        boolean back = false;
        while (!back) {
            displayAccountMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    double depositAmount = getDoubleInput("Enter deposit amount: ");
                    account.deposit(depositAmount);
                    break;
                case 3:
                    double withdrawAmount = getDoubleInput("Enter withdrawal amount: ");
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void displayAccountMenu() {
        System.out.println("\n--- Account Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Back to Main Menu");
        System.out.println("------------------");
    }
    
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    private static int getIntInput(String prompt) {
        int input = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        
        return input;
    }
    
    private static double getDoubleInput(String prompt) {
        double input = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print(prompt);
                input = Double.parseDouble(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        
        return input;
    }
}