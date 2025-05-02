# Basic Banking System

A simple Java console application that simulates a banking system. This project demonstrates core object-oriented programming concepts and provides hands-on experience with Java for entry-level developers.

## Features

- **Account Management**:
  - Create new bank accounts (Savings or Current)
  - View account details and balance
  - Deposit and withdraw money
  - List all accounts in the bank

- **User Interface**:
  - Interactive console-based menu system
  - Input validation and error handling
  - Clear feedback for all operations

## Project Structure

The project consists of three main Java classes:

1. **Account.java**: Represents individual bank accounts
   - Stores account information (number, holder name, balance, type)
   - Handles deposits and withdrawals
   - Provides balance checking functionality

2. **Bank.java**: Manages the collection of accounts
   - Creates new accounts with unique account numbers
   - Finds accounts by account number
   - Lists all accounts in the bank

3. **BankingApp.java**: Contains the main method and user interface
   - Displays menus and processes user input
   - Connects user actions to bank and account operations
   - Provides input validation and formatting

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or a text editor and command line

### Installation

1. Clone the repository or download the source files
2. Open the project in your Java IDE or navigate to the project directory in your terminal

### Running the Application

1. Compile the Java files:
   ```
   javac BankingApp.java
   ```

2. Run the application:
   ```
   java BankingApp
   ```

## Usage Guide

### Creating a New Account
1. Select option 1 from the main menu
2. Enter the account holder's name
3. Specify the initial deposit amount
4. Choose the account type (Savings or Current)
5. Note the generated account number for future access

### Accessing an Existing Account
1. Select option 2 from the main menu
2. Enter the account number
3. From the account menu, you can:
   - Check balance
   - Make a deposit
   - Make a withdrawal
   - Return to the main menu

### Viewing All Accounts
1. Select option 3 from the main menu to see a list of all accounts in the bank

## Learning Objectives

This project helps new Java developers understand:

- Object-oriented programming principles (classes, objects, encapsulation)
- Basic data handling and validation
- User input processing
- Console-based UI design
- Java collections (ArrayList)
- Exception handling
- Control flow with loops and conditionals

## Future Enhancements

Consider extending the project with these features:

1. **Data Persistence**:
   - Save accounts to files or a database
   - Load accounts when the program starts

2. **Security Features**:
   - User authentication with passwords
   - Account locking after failed attempts

3. **Additional Functionality**:
   - Interest calculation for savings accounts
   - Transaction history and statements
   - Fund transfers between accounts
   - Different interest rates based on account balance
   - Overdraft facilities for current accounts

4. **UI Improvements**:
   - Graphical user interface with JavaFX or Swing
   - Better formatting of monetary values and dates

## Contributing

This project is designed for learning purposes. Feel free to fork it and add your own improvements or use it as a base for more advanced banking applications.

## License

This project is available for educational use.

## Acknowledgments

- Developed as an entry-level Java programming exercise
- Designed to demonstrate fundamental programming concepts in a practical context