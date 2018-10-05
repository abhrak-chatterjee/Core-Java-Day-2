package com.capgemini.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingsAccount;

public class BankAccountArrayList 
{
	ArrayList<BankAccount> accountList = new ArrayList<BankAccount> ();
	
	public static void main(String[] args) 
	{
		BankAccountArrayList bankAccountArrayList =  new BankAccountArrayList();
		
		bankAccountArrayList.createBankDetails(new SavingsAccount("Abhrak",15505));
		bankAccountArrayList.createBankDetails(new SavingsAccount("Kaushik",25505));
		bankAccountArrayList.createBankDetails(new SavingsAccount("Bapi",5505));

		System.out.println(bankAccountArrayList.getBankDetails().toString());
		
		System.out.println(bankAccountArrayList.sortByName().toString());
		
		System.out.println(bankAccountArrayList.removeBankDetailsById(1).toString());
		
		bankAccountArrayList.createBankDetails(new SavingsAccount("Abhrak",15505));
		
		System.out.println(bankAccountArrayList.getBankDetails().toString());
		
		System.out.println(bankAccountArrayList.sortByNameV2().toString());
		
		System.out.println(bankAccountArrayList.updateBankDetails(4, "Rick").toString());
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
	
	public ArrayList<BankAccount> getBankDetails() 
	{
		
		return accountList;  
	}
	
	public ArrayList<BankAccount> removeBankDetailsById(int accountNo) 
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
	
	public ArrayList<BankAccount> updateBankDetails(int accountNo, String accountHolderName) 
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
	
	public ArrayList<BankAccount> sortByName() 
	{
		Collections.sort(accountList,(BankAccount acc1, BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return accountList;
	}
	
	public ArrayList<BankAccount> sortByNameV2() 
	{
		Collections.sort(accountList, new Comparator<BankAccount>()
		{
			
			@Override
			public int compare(BankAccount acc1, BankAccount acc2) 
			{
				
				return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
			}
		});
		return accountList;
	}
}
