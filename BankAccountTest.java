package week3;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ivan = new BankAccount("Ivan", 2000);
		System.out.println("The balance is:" + ivan.getBalance());
		ivan.deposit(200);
		System.out.println("The balance is:" + ivan.getBalance());
		ivan.withdraw(100);
		System.out.println("The balance is:" + ivan.getBalance());
		
	}
}
