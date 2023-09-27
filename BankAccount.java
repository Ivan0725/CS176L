package week3;

public class BankAccount {
	
	public String accountName;
	public double balance;
	
	public BankAccount() {
		this.accountName = "Ivan";
		this.balance = 0;				
	}
	public BankAccount(double initialBalance) {
	    this.accountName = "Ivan";
	    this.balance = initialBalance;
	}
	public BankAccount(String accountName, double initialBalance) {
	    this.accountName = "Ivan";
	    this.balance = initialBalance;
	}
	
	public void deposit(double initialBalance) {
		balance += initialBalance;
	}
	
	public void withdraw(double initialBalance) {
		balance -= initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {				

	}

}
