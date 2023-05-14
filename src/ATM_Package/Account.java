package ATM_Package;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
//	Set the customer number.
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

//	get the Customer Number.
	
	public int getCustomerNumber() {
		return this.customerNumber;
	}
	
//	Set the Pin number.
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

//	get the Pin Number.
	
	public int getPinNumber() {
		return this.pinNumber;
	}
	
//	Get Checking Account Balance.
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
//  Get Saving Account Balance.	
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
// Calculate Checking Account withdraw.
	
	 public double calcCheckingWithdraw(double amount) {
		 checkingBalance = (checkingBalance - amount);
		 return checkingBalance;
	 }

// Calculate Saving Account withdraw.
	 
	 public double calcSavingWithdraw(double amount) {
		  savingBalance = (savingBalance - amount);
		  return savingBalance;
	 }

// Calculate Checking Account deposit.
		
	 public double calcCheckingDeposit(double amount) {
		  checkingBalance = (checkingBalance + amount);
		  return checkingBalance;
	 }

// Calculate Saving Account deposit.
		 
		 public double calcSavingDeposit(double amount) {
			  savingBalance = (savingBalance + amount);
			  return savingBalance;
		 }
	
//	 Customer Checking Account Withdraw Input
	 
	 public void getCheckingWithdrawInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount you want to withdraw from Checking Account");
		 double amount = input.nextDouble(); 
		 
		 if((checkingBalance - amount) >= 0) {
			 calcCheckingWithdraw(amount);
			 System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 }else
			 System.out.println("Balance cannot be negative");
		
	 }
	
//	 Customer Saving Account Withdraw Input
	 
	 public void getSavingWithdrawInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount you want to withdraw from Checking Account");
		 double amount = input.nextDouble(); 
		 
		 if((checkingBalance - amount) >= 0) {
			 calcCheckingWithdraw(amount);
			 System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 }else
			 System.out.println("Balance cannot be negative");
		
	 }
	 
//	 Customer Checking Account Deposit Input
	 
	 public void getCheckingDepositInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount you want to deposit into Checking Account");
		 double amount = input.nextDouble(); 
		 
		 if((checkingBalance + amount) >= 0) {
			 calcCheckingDeposit(amount);
			 System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 }else
			 System.out.println("Balance cannot be negative");
		
	 }
	
//	 Customer Saving Account Deposit Input
	 
	 public void getSavingDepositInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(savingBalance));
		 System.out.println("Amount you want to deposit into saving Account");
		 double amount = input.nextDouble(); 
		 
		 if((savingBalance - amount) >= 0) {
			 calcSavingDeposit(amount);
			 System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 }else
			 System.out.println("Balance cannot be negative");
		
	 }
}
