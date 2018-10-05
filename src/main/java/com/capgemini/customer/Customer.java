package com.capgemini.customer;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.SavingsAccount;
import com.capgemini.list.BankAccountList;

public class Customer 
{
	public static void main(String[] args) 
	{
		int i;
				
		//BankAccountList bankAccountList = new BankAccountList();
		BankAccount acc1 = new SavingsAccount();
		
		acc1.withdraw(500);
		acc1.deposit(5000);
		acc1.setAccountHolderName("Abhrak Chatterjee");
		acc1.isSalaryAccount();
		
		BankAccount acc2 = new CurrentAccount();
		acc2.withdraw(500);
		acc2.deposit(5000);
		acc2.setAccountHolderName("Abhrak Chatterjee");
		acc2.isSalaryAccount();
		
		/*bankAccount[0]=bankAccountList.getBankDetails(acc1);
		bankAccountList.createBankDetails(acc1);
		bankAccountList.getBankDetailsById(acc1,1);	
		bankAccountList.updateBankDetailsById(acc1,1);
		bankAccountList.removeBankDetailsById(acc1,1);
		
		bankAccount[0]=bankAccountList.getBankDetails(acc2);
		bankAccountList.createBankDetails(acc2);
		bankAccountList.getBankDetailsById(acc2,2);	
		bankAccountList.updateBankDetailsById(acc2,2);
		bankAccountList.removeBankDetailsById(acc2,2);*/
		
		/*System.out.println("BankAccount 1 "+"[accountNo=" + acc1.getAccountNo() + ", accountHolderName=" + acc1.getAccountHolderName() + ", accountBalance="
				+ acc1.getAccountBalance()+ "]");
		
		System.out.println("BankAccount 2 "+"[accountNo=" + acc2.getAccountNo() + ", accountHolderName=" + acc2.getAccountHolderName() + ", accountBalance="
				+ acc2.getAccountBalance()+ "]");*/
	}
}
