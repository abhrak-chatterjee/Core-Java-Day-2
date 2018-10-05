package com.capgemini.set;

import java.util.TreeSet;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingsAccount;

public class BankAccountTreeSet 
{
TreeSet<BankAccount> accountList = new TreeSet<BankAccount> ();
	
	public static void main(String[] args) 
	{
		BankAccountTreeSet bankAccountTreeSet =  new BankAccountTreeSet();
		
		bankAccountTreeSet.createBankDetails(new SavingsAccount("Abhrak",15505));
		bankAccountTreeSet.createBankDetails(new SavingsAccount("Kaushik",25505));
		bankAccountTreeSet.createBankDetails(new SavingsAccount("Bapi",5505));
		
		System.out.println(bankAccountTreeSet.getBankDetails().toString());
		
		//System.out.println(bankAccountTreeSet.sortByName().toString());
		
		System.out.println(bankAccountTreeSet.removeBankDetailsById(1).toString());
		
		bankAccountTreeSet.createBankDetails(new SavingsAccount("Abhrak",15505));
		
		System.out.println(bankAccountTreeSet.getBankDetails().toString());
		
		//System.out.println(bankAccountTreeSet.sortByNameV2().toString());
		
		System.out.println(bankAccountTreeSet.updateBankDetails(4, "Rick").toString());
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
	
	public TreeSet<BankAccount> getBankDetails() 
	{
		
		return accountList;  
	}
	
	public TreeSet<BankAccount> removeBankDetailsById(int accountNo) 
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
	
	public TreeSet<BankAccount> updateBankDetails(int accountNo, String accountHolderName) 
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
	
	/*public TreeSet<BankAccount> sortByName() 
	{
		//ArrayList<BankAccount> sortedList = new ArrayList<BankAccount>();
		Collections.sort(accountList,(BankAccount acc1, BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return accountList;
	}
	
	public TreeSet<BankAccount> sortByNameV2() 
	{
		//ArrayList<BankAccount> sortedList = new ArrayList<BankAccount>();
		Collections.sort(accountList, new Comparator<BankAccount>() {
			
			@Override
			public int compare(BankAccount acc1, BankAccount acc2) {
				// TODO Auto-generated method stub
				return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
			}
		});
		return accountList;
	}*/
}
