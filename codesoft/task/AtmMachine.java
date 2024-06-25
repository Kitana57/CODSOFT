package com.codesoft.task;

import java.util.Scanner;

public class AtmMachine {
	static double amount;
	static Scanner scanner;
	static BankAccount bank;
	public static void main(String[] args) {
		
		scanner=new Scanner(System.in);
		System.out.println("enter the initial amount");
		double initialBalance=scanner.nextDouble();
		 bank=new BankAccount(initialBalance);
		displayMenu();
		
	}
	public static void displayMenu() {
		String chooseString;
		do {
			System.out.println("ATM Menu");
			System.out.println(" click 1 : to checkbalance");
			System.out.println(" click 2 : to deposit");
			System.out.println(" click 3 : to withdraw");
			System.out.println(" click 4 : to exit");
			System.out.println("Choose any one option you want: ");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				depositing(amount);
				break;
			case 3:
				withDrawing(amount);
				break;
			case 4:
				System.out.println("Thank you for using our ATM. See you soon");
				break;
			default:
				System.out.println("invalid choice. Please try again later");
			}
			System.out.println("would you Like to give any other task");
			chooseString=scanner.next();
			
		}while(chooseString.equalsIgnoreCase("yes"));
		System.out.println("thank you for using our ATM!");
	}
	public static void withDrawing(double amount) {
		System.out.println("enter the amount to be withdrawn");
		amount= scanner.nextDouble();
		bank.afterWithdrawl(amount);
	}
	public static void depositing(double amount) {
		System.out.println("enter the amount to be deposited");
		amount= scanner.nextDouble();
		bank.afterDepositing(amount);
	}
	public static void checkBalance() {
		System.out.println("The amount of money the bank account has is: "+bank.checkBalance());
	}
}