package com.capgemini.set;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingsAccount;

public class BankAccountHashSet 
{
HashSet<BankAccount> accountList = new HashSet<BankAccount> ();
	
	public static void main(String[] args) 
	{
		BankAccountHashSet bankAccountHashSet =  new BankAccountHashSet();
		
		bankAccountHashSet.createBankDetails(new SavingsAccount("Abhrak",15505));
		bankAccountHashSet.createBankDetails(new SavingsAccount("Kaushik",25505));
		bankAccountHashSet.createBankDetails(new SavingsAccount("Bapi",5505));
		
		System.out.println(bankAccountHashSet.getBankDetails().toString());
		
		System.out.println(bankAccountHashSet.sortByName().toString());
		
		System.out.println(bankAccountHashSet.removeBankDetailsById(1).toString());
		
		bankAccountHashSet.createBankDetails(new SavingsAccount("Abhrak",15505));
		
		System.out.println(bankAccountHashSet.getBankDetails().toString());
		
		System.out.println(bankAccountHashSet.sortByNameV2().toString());
		
		System.out.println(bankAccountHashSet.updateBankDetails(4, "Rick").toString());
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
	
	public HashSet<BankAccount> getBankDetails() 
	{
		
		return accountList;  
	}
	
	public HashSet<BankAccount> removeBankDetailsById(int accountNo) 
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
	
	public HashSet<BankAccount> updateBankDetails(int accountNo, String accountHolderName) 
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
	
	public HashSet<BankAccount> sortByName() 
	{
		ArrayList<BankAccount> sortedList = new ArrayList<BankAccount>();
		Collections.sort(sortedList,(BankAccount acc1, BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return accountList;
	}
	
	public HashSet<BankAccount> sortByNameV2() 
	{
		ArrayList<BankAccount> sortedList = new ArrayList<BankAccount>();
		Collections.sort(sortedList, new Comparator<BankAccount>() {
			
			@Override
			public int compare(BankAccount acc1, BankAccount acc2) {
				// TODO Auto-generated method stub
				return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
			}
		});
		return accountList;
	}
}
