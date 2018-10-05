package com.capgemini.list;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingsAccount;

public class BankAccountLinkedList {

LinkedList<BankAccount> accountList = new LinkedList<BankAccount> ();
	
	public static void main(String[] args) 
	{
		BankAccountLinkedList bankAccountLinkedList =  new BankAccountLinkedList();
		
		bankAccountLinkedList.createBankDetails(new SavingsAccount("Abhrak",15505));
		bankAccountLinkedList.createBankDetails(new SavingsAccount("Kaushik",25505));
		bankAccountLinkedList.createBankDetails(new SavingsAccount("Bapi",5505));
		
		System.out.println(bankAccountLinkedList.getBankDetails().toString());
		
		System.out.println(bankAccountLinkedList.sortByName().toString());
		
		System.out.println(bankAccountLinkedList.removeBankDetailsById(1).toString());
		
		bankAccountLinkedList.createBankDetails(new SavingsAccount("Abhrak",15505));
		
		System.out.println(bankAccountLinkedList.getBankDetails().toString());
		
		System.out.println(bankAccountLinkedList.sortByNameV2().toString());
		
		System.out.println(bankAccountLinkedList.updateBankDetails(4, "Rick").toString());
	}
	
	
	public BankAccount getBankDetailsById(int accountNo) 
	{
		for(BankAccount acc : accountList)
		{
			if(acc.getAccountNo() == accountNo)
			{
				return acc;
			}
		}
		throw new RuntimeException("Account does not exist");
	}
	
	public LinkedList<BankAccount> getBankDetails() 
	{
		
		return accountList;  
	}
	
	public LinkedList<BankAccount> removeBankDetailsById(int accountNo) 
	{
		for(BankAccount account : accountList)
		{
			if(account.getAccountNo()==accountNo)
			{
				accountList.remove(account);
				return accountList;
			}
		}
		throw new RuntimeException("Account does not exist");
	}
	
	public LinkedList<BankAccount> updateBankDetails(int accountNo, String accountHolderName) 
	{
		for(BankAccount account : accountList)
		{
			if(account.getAccountNo()==accountNo)
			{
				account.setAccountHolderName(accountHolderName);
				return accountList;
			}
		}
		throw new RuntimeException("Account supplied does not exist");
	}
	
	public void createBankDetails(BankAccount acc) 
	{
		accountList.add(acc);
		
	}
	
	public LinkedList<BankAccount> sortByName() 
	{
		Collections.sort(accountList,(BankAccount acc1, BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return accountList;
	}
	
	public LinkedList<BankAccount> sortByNameV2() 
	{
		Collections.sort(accountList, new Comparator<BankAccount>() {
			
			@Override
			public int compare(BankAccount acc1, BankAccount acc2) {
				// TODO Auto-generated method stub
				return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
			}
		});
		return accountList;
	}

}
