package entities;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String holder)  {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		this.deposit(initialDeposit);
	}

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account: " + getNumber()
 				+ ", Holder: " + getHolder()
 				+ ", Balance: $" + String.format("%.2f", getBalance())
 				+ "\n";
	}
	
}
