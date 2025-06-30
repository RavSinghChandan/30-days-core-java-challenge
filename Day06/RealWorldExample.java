/**
 * Real World Example: Bank Account Management System
 * Demonstrates OOP basics: Class, Object, Constructor, static, this
 */

import java.util.ArrayList;
import java.util.List;

public class RealWorldExample {
    
    public static void main(String[] args) {
        System.out.println("=== Bank Account Management System ===\n");
        
        // Demonstrate class and object creation
        demonstrateClassAndObjects();
        
        // Demonstrate constructors
        demonstrateConstructors();
        
        // Demonstrate static members
        demonstrateStaticMembers();
        
        // Demonstrate 'this' keyword
        demonstrateThisKeyword();
        
        // Demonstrate practical application
        demonstrateBankSystem();
    }
    
    // Demonstrate class and object creation
    public static void demonstrateClassAndObjects() {
        System.out.println("--- Class and Object Creation ---");
        
        // Creating objects of BankAccount class
        BankAccount account1 = new BankAccount("John Doe", "ACC001", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", "ACC002", 2500.0);
        
        System.out.println("Created two bank accounts:");
        account1.displayInfo();
        account2.displayInfo();
        
        // Using object methods
        System.out.println("\nPerforming transactions:");
        account1.deposit(500.0);
        account2.withdraw(300.0);
        account1.transfer(account2, 200.0);
        
        System.out.println("\nAfter transactions:");
        account1.displayInfo();
        account2.displayInfo();
    }
    
    // Demonstrate constructors
    public static void demonstrateConstructors() {
        System.out.println("\n--- Constructor Demonstrations ---");
        
        // Using different constructors
        BankAccount defaultAccount = new BankAccount();
        BankAccount namedAccount = new BankAccount("Bob Wilson");
        BankAccount fullAccount = new BankAccount("Alice Brown", "ACC003", 5000.0);
        
        System.out.println("Default constructor account:");
        defaultAccount.displayInfo();
        
        System.out.println("\nNamed account:");
        namedAccount.displayInfo();
        
        System.out.println("\nFull account:");
        fullAccount.displayInfo();
    }
    
    // Demonstrate static members
    public static void demonstrateStaticMembers() {
        System.out.println("\n--- Static Members Demonstration ---");
        
        // Accessing static members without creating objects
        System.out.println("Bank name: " + BankAccount.getBankName());
        System.out.println("Interest rate: " + BankAccount.getInterestRate() + "%");
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
        
        // Creating accounts to see static counter increase
        BankAccount acc1 = new BankAccount("Customer1", "ACC004", 1000.0);
        BankAccount acc2 = new BankAccount("Customer2", "ACC005", 2000.0);
        BankAccount acc3 = new BankAccount("Customer3", "ACC006", 3000.0);
        
        System.out.println("After creating 3 accounts, total: " + BankAccount.getTotalAccounts());
        
        // Using static utility methods
        System.out.println("\nStatic utility methods:");
        double compoundInterest = BankAccount.calculateCompoundInterest(1000.0, 5, 0.05);
        System.out.println("Compound interest for $1000 over 5 years at 5%: $" + compoundInterest);
        
        boolean isValidAccountNumber = BankAccount.validateAccountNumber("ACC007");
        System.out.println("Is ACC007 a valid account number? " + isValidAccountNumber);
    }
    
    // Demonstrate 'this' keyword
    public static void demonstrateThisKeyword() {
        System.out.println("\n--- 'this' Keyword Demonstration ---");
        
        // Creating account with constructor chaining
        BankAccount chainedAccount = new BankAccount("Test User", "ACC008");
        chainedAccount.displayInfo();
        
        // Demonstrating method chaining
        BankAccount chainAccount = new BankAccount("Chain User", "ACC009", 100.0);
        chainAccount.depositChain(200.0)
                   .withdrawChain(50.0)
                   .depositChain(300.0)
                   .displayInfo();
    }
    
    // Demonstrate practical bank system
    public static void demonstrateBankSystem() {
        System.out.println("\n--- Practical Bank System ---");
        
        // Create a list of accounts
        List<BankAccount> accounts = new ArrayList<>();
        
        // Add some accounts
        accounts.add(new BankAccount("John Doe", "ACC010", 1000.0));
        accounts.add(new BankAccount("Jane Smith", "ACC011", 2500.0));
        accounts.add(new BankAccount("Bob Johnson", "ACC012", 750.0));
        accounts.add(new BankAccount("Alice Brown", "ACC013", 3000.0));
        
        // Display all accounts
        System.out.println("All Bank Accounts:");
        for (BankAccount account : accounts) {
            account.displayInfo();
        }
        
        // Calculate total bank balance
        double totalBalance = 0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        
        System.out.println("\nBank Statistics:");
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total bank balance: $" + totalBalance);
        System.out.println("Average balance: $" + (totalBalance / accounts.size()));
        
        // Perform some transactions
        System.out.println("\nPerforming transactions:");
        accounts.get(0).transfer(accounts.get(1), 200.0);
        accounts.get(2).deposit(500.0);
        accounts.get(3).withdraw(1000.0);
        
        // Display updated accounts
        System.out.println("\nUpdated accounts:");
        for (BankAccount account : accounts) {
            account.displayInfo();
        }
    }
}

// BankAccount class demonstrating OOP concepts
class BankAccount {
    // Instance variables (attributes)
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    // Static variables (shared across all objects)
    private static String bankName = "Java Bank";
    private static double interestRate = 2.5;
    private static int totalAccounts = 0;
    
    // Static block for initialization
    static {
        System.out.println("Bank system initialized with interest rate: " + interestRate + "%");
    }
    
    // Constructors (demonstrating constructor overloading)
    
    // Default constructor
    public BankAccount() {
        this("Unknown", "ACC" + String.format("%03d", ++totalAccounts), 0.0);
    }
    
    // Constructor with account holder name
    public BankAccount(String accountHolder) {
        this(accountHolder, "ACC" + String.format("%03d", ++totalAccounts), 0.0);
    }
    
    // Constructor with account holder and account number
    public BankAccount(String accountHolder, String accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }
    
    // Main constructor (called by other constructors)
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account created: " + accountNumber + " for " + accountHolder);
    }
    
    // Instance methods
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + " to " + this.accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + this.accountNumber);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }
    
    public boolean transfer(BankAccount target, double amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transferred $" + amount + " from " + this.accountNumber + " to " + target.accountNumber);
            return true;
        }
        return false;
    }
    
    // Method chaining versions
    public BankAccount depositChain(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + " to " + this.accountNumber);
        }
        return this; // Return current object for chaining
    }
    
    public BankAccount withdrawChain(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + this.accountNumber);
        }
        return this; // Return current object for chaining
    }
    
    public void displayInfo() {
        System.out.println("Account: " + this.accountNumber + 
                          " | Holder: " + this.accountHolder + 
                          " | Balance: $" + this.balance);
    }
    
    // Getter methods
    public double getBalance() {
        return this.balance;
    }
    
    public String getAccountHolder() {
        return this.accountHolder;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    // Static methods (utility methods)
    public static String getBankName() {
        return bankName;
    }
    
    public static double getInterestRate() {
        return interestRate;
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public static double calculateCompoundInterest(double principal, int years, double rate) {
        return principal * Math.pow(1 + rate, years) - principal;
    }
    
    public static boolean validateAccountNumber(String accountNumber) {
        return accountNumber != null && accountNumber.startsWith("ACC") && accountNumber.length() >= 6;
    }
    
    public static void setInterestRate(double newRate) {
        if (newRate >= 0) {
            interestRate = newRate;
            System.out.println("Interest rate updated to: " + newRate + "%");
        }
    }
}
