package set2problems;

public class Exer30 {
	
	public static void main(String []args) {
		SavingsAccount account1 =new SavingsAccount();
		SavingsAccount account2 =new SavingsAccount(25000.00,2,10020);
		account1.withDraw(5);
		account2.withDraw(10000);
		account2.withDraw(20000);
		account2.calculateInterest();
	}
}
