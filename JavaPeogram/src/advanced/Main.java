package advanced;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		

		        BankAccountCollection collection = new BankAccountCollection();
		        Scanner scanner = new Scanner(System.in);

		        
		        BankAccount account1 = new BankAccount("1234", "John Doe", 1000);
		        BankAccount account2 = new BankAccount("5678", "Jane Smith", 5000);
		        BankAccount account3 = new BankAccount("9012", "Alice Johnson", 3000);

		        collection.addAccount(account1);
		        collection.addAccount(account2);
		        collection.addAccount(account3);

		        while (true) {
		            System.out.println("\n----- Bank Account Management System -----");
		            System.out.println("1. Add Bank Account");
		            System.out.println("2. Find Account Details");
		            System.out.println("3. List All Accounts (Ascending Order)");
		            System.out.println("4. Find Highest Balance Account");
		            System.out.println("5. Update Account Balance (Deposit)");
		            System.out.println("6. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume the newline character left by nextInt()

		            switch (choice) {
		                case 1:
		                    addBankAccount(scanner, collection);
		                    break;
		                case 2:
		                    findAccountDetails(scanner, collection);
		                    break;
		                case 3:
		                    listAccountsAscendingOrder(collection);
		                    break;
		                case 4:
		                    findHighestBalanceAccount(collection);
		                    break;
		                case 5:
		                    updateAccountBalance(scanner, collection);
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please enter a valid option.");
		            }
		        }
		    }

		    private static void addBankAccount(Scanner scanner, BankAccountCollection collection) {
		        System.out.print("Enter Account Number: ");
		        String accountNumber = scanner.nextLine();
		        System.out.print("Enter Account Name: ");
		        String accountName = scanner.nextLine();
		        System.out.print("Enter Initial Balance: ");
		        double balance = scanner.nextDouble();
		        scanner.nextLine(); 

		        BankAccount newAccount = new BankAccount(accountNumber, accountName, balance);
		        collection.addAccount(newAccount);
		        System.out.println("Bank Account added successfully.");
		    }

		    private static void findAccountDetails(Scanner scanner, BankAccountCollection collection) {
		        System.out.print("Enter Account Number to find: ");
		        String accountNumber = scanner.nextLine();
		        BankAccount foundAccount = collection.findAccountByNumber(accountNumber);
		        if (foundAccount != null) {
		            System.out.println("Found Account:");
		            System.out.println(foundAccount);
		        } else {
		            System.out.println("Account with number '" + accountNumber + "' not found.");
		        }
		    }

		    private static void listAccountsAscendingOrder(BankAccountCollection collection) {
		        System.out.println("\nList of all accounts (sorted by account number):");
		        collection.listAccountsAscendingOrder();
		    }

		    private static void findHighestBalanceAccount(BankAccountCollection collection) {
		        BankAccount highestBalanceAccount = collection.findHighestBalanceAccount();
		        if (highestBalanceAccount != null) {
		            System.out.println("\nHighest Balance Account:");
		            System.out.println(highestBalanceAccount);
		        } else {
		            System.out.println("No accounts found.");
		        }
		    }

		    private static void updateAccountBalance(Scanner scanner, BankAccountCollection collection) {
		        System.out.print("Enter Account Number to deposit amount: ");
		        String accountNumberToUpdate = scanner.nextLine();
		        System.out.print("Enter Amount to deposit: ");
		        double depositAmount = scanner.nextDouble();
		        scanner.nextLine(); 

		        collection.updateAccountBalance(accountNumberToUpdate, depositAmount);
		    }
		

	}


