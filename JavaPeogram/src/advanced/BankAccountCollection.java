package advanced;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccountCollection {
	    private List<BankAccount> accounts;

	    public BankAccountCollection() {
	        accounts = new ArrayList<>();
	    }

	    public boolean addAccount(BankAccount account) {
	        if (!isDuplicate(account)) {
	            accounts.add(account);
	            return true;
	        } else {
	            System.out.println("Account already exists. Duplicate accounts are not allowed.");
	            return false;
	        }
	    }

	    private boolean isDuplicate(BankAccount account) {
	        return accounts.stream().anyMatch(acc -> acc.getAccountNumber().equals(account.getAccountNumber()));
	    }

	    public BankAccount findAccountByNumber(String accountNumber) {
	        return accounts.stream()
	                .filter(account -> account.getAccountNumber().equals(accountNumber))
	                .findFirst()
	                .orElse(null);
	    }

	    public void listAccountsAscendingOrder() {
	        accounts.stream()
	                .sorted(Comparator.comparing(BankAccount::getAccountNumber))
	                .forEach(account -> System.out.println(account));
	    }

	    public BankAccount findHighestBalanceAccount() {
	        return accounts.stream()
	                .max(Comparator.comparingDouble(BankAccount::getBalance))
	                .orElse(null);
	    }

	    public void updateAccountBalance(String accountNumber, double depositAmount) {
	        BankAccount account = findAccountByNumber(accountNumber);
	        if (account != null) {
	            account.deposit(depositAmount);
	            System.out.println("Deposit successful. Updated account details:");
	            System.out.println(account);
	        } else {
	            System.out.println("Account with number '" + accountNumber + "' not found.");
	        }
	    }
	}


