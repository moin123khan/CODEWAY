package Task_3;

import java.util.Objects;

public class BankAccount {
	
	//taking static account balance
	private int accountBalance;
	
	
	public BankAccount() {
		super();
		this.accountBalance=0;
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(int accountbalance) {
		super();
		this.accountBalance = accountbalance;
	}
	
	//this will return the current bank balance
	public int checkBalance() {
		return this.accountBalance;
	}

	//this is used during the deposit
	public void deposit(int amount) {
		System.out.println(amount+" amount deposited successfully.");
		this.accountBalance+= amount;
		System.out.println("Updated balance: "+this.accountBalance);
	}

	//this is used during the withdraw.
	public void withdraw(int amount) {
		this.accountBalance -= amount;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountBalance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return accountBalance == other.accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountBalance=" + accountBalance + "]";
	}

	
	
}
