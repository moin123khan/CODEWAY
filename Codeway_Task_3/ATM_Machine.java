package Task_3;

import java.util.Scanner;

public class ATM_Machine {
	
	public void executeTransaction(int input,BankAccount myBank) {
		
		Scanner sc=new Scanner(System.in);
		
		//switching according to user input
		switch(input) {
		
		case 1: 
			//giving the current balance of user
			System.out.println("Current Balance: "+myBank.checkBalance());
		break;
		
		case 2: 
			//depositing amount in user account
			System.out.println("Enter the amount to be deposited.");
			int depositAmount=sc.nextInt();
			myBank.deposit(depositAmount);
		break;
		
		case 3:
			//withdrawing amount from account
			System.out.println("Enter the amount to withdraw.");
			
			int withdrawAmount=sc.nextInt();
			
			//checking if the withdraw amount is available or not
			if(withdrawAmount<=myBank.checkBalance()) {
				myBank.withdraw(withdrawAmount);
				System.out.println("Withdrawl successfull.");
			}else {
				System.out.println("Balance Low!!!\nTransaction declined.");
			}
		break;
		
		default: 
			//if user input doesn't match with any input
			System.out.println("Please enter the correct input!!!\nTransaction declined!!!");
		}
	}
	
	public void myATM() {
		
		Scanner sc=new Scanner(System.in);
		
		int exitTransaction=0;
		
		System.out.println("Welcome to CodeWay Bank.\n");
		
		//taking the instance of bank account
		BankAccount myBank=new BankAccount();
		
		
		do {
		
		System.out.println("Kindly choose from below options:");
		System.out.println("Current Balance--->1\nDeposit Amount--->2\nWithdraw Amount--->3\n");
		
		//taking user input
		int userInput=sc.nextInt();
		
		//executing the transaction based on user input
		executeTransaction(userInput,myBank);
		
		//asking user if they want to do more transaction
		System.out.println("\nDo you want to make more transaction\nYes--->1\nNo--->0");
		exitTransaction=sc.nextInt();
		System.out.println();
		
		if(exitTransaction==0) {
			System.out.println("Exit Successfull.\n\n");
		}
		
		}while(exitTransaction!=0); //doing transaction until user exit.
		
		
	}
	
	public static void main(String[] args) {
		ATM_Machine atm=new ATM_Machine();
		
		//starting the atm interface
		atm.myATM();
	
	}
}
