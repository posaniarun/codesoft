import java.util.Scanner;

// BankAccount class represents the user's bank account
class BankAccount {
    private double balance; // to store the account balance
    
    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    // Method to withdraw money from the account, returns true if successful, false if insufficient funds
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}

// ATM class represents the ATM machine interface
public class ATM {
    private BankAccount account; // to store the user's bank account
    private Scanner scanner; // to read user input
    
    // Constructor to initialize ATM with a bank account
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    
    // Method to start the ATM operation
    public void run() {
        while (true) {
            showMenu(); // display ATM menu
            int choice = scanner.nextInt(); // read user choice
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        }
    }
    
    // Method to display the ATM menu
    private void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    
    // Method to check account balance
    private void checkBalance() {
        System.out.println("Your balance is: $" + account.getBalance());
    }
    
    // Method to deposit money into the account
    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    
    // Method to withdraw money from the account
    private void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Please take your cash.");
        }
    }
    
    // Main method to start the ATM application
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initialize with $1000
        ATM atm = new ATM(account);
        atm.run();
    }
}
