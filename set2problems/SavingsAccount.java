package set2problems;

public class SavingsAccount {
	double balance;
	int interestRate;
	int accountNo;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(double balance, int interestRate, int accountNo) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	public void withDraw(double amount) {
		if(amount>balance) {
			System.out.println("Error: Insufficient balance");
			return;
		}
		this.balance=balance-amount;
		System.out.println("Successfully withdrawn"+amount);
	}
	public void calculateInterest() {
		int time = 1;
		double simpleInterest=(this.balance*time*this.interestRate)/100;
		System.out.println("Interest found : "+simpleInterest);
	}
}
