package advanced;

public class BankAccount {
	
	   String accountNumber;
	     String accountName;
	     double balance;

	    public BankAccount(String accountNumber, String accountName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountName = accountName;
	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountName() {
	        return accountName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        this.balance += amount;
	    }

	    @Override
	    public String toString() {
	        return "Account Number: " + accountNumber + ", Account Name: " + accountName + ", Balance: " + balance;
	    }
	}


