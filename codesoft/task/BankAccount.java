package com.codesoft.task;

public class BankAccount {
	 
	static double accountBalance;
	static AtmMachine atm=new AtmMachine();
	
	public BankAccount(double initialBalance) {
		// TODO Auto-generated constructor stub
		accountBalance = initialBalance;
	}
	public static void main() {
		AtmMachine atm=new AtmMachine();
	}
	public static void afterWithdrawl(double amount) {
		if(amount>0 && amount<=accountBalance) {
			accountBalance-= amount;
			System.out.println("the given " +amount +" is successfully debited from your bank account \n "
					+ "Now the account balance is"+accountBalance);
			
		}
		else {
			System.out.println("There is no sufficient amount in the bank account");
			
		}
	}
	public static void afterDepositing(double amount) {
		if(amount>0) {
			accountBalance+=amount;
			System.out.println("the given " +amount +" is successfully credited to your bank account \n "
					+ "Now the account balance is"+accountBalance);
			System.out.println("TRANSACTION SUCCESSFUL");
		}
		else {
			System.out.println("not enough amount");
			System.out.println("TRANSACTION FAILED");
		}
	}
	public double checkBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
}
