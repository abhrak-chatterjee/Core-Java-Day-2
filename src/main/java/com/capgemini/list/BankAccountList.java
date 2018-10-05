package com.capgemini.list;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingsAccount;

public class BankAccountList
{
	BankAccount accountList[] = new BankAccount[5];
	int index = -1;
	public void getBankDetailsById(int accountNo) 
	{
		System.out.println("Account Details of "+accountNo);
		for(index=0;index<accountList.length;index++)
		{
			if(accountList[index].accountNo == accountNo)
				System.out.println("Details: "+"[accountNo=" + accountList[index].getAccountNo() + ", accountHolderName=" + accountList[index].getAccountHolderName() + ", accountBalance="
					+ accountList[index].getAccountBalance()+ "]");
		}
	}
	
	public BankAccount[] getBankDetails(BankAccount acc) 
	{
		return accountList;
	}
	
	public BankAccount[] removeBankDetailsById(int accountNo) 
	{
		int j,k;
		for(j=0;j<=index;j++)
		{
			if(accountList[j].getAccountNo() == accountNo)
			{
				for(k=j;k<-1;k++)
				{
					accountList[k] = accountList[k+1];
				}
				index--;
			}
		}
		return accountList;
	}
	
	public BankAccount[] updateBankDetails(int accountNo, String accountHolderName) 
	{
		for(index=0;index<accountList.length;index++)
		{
			if(accountList[index].getAccountNo() == accountNo)
			{
				accountList[index].setAccountHolderName(accountHolderName);
				return accountList;
			}
		}
		throw new RuntimeException("Account does not exist");
	}
	
	public BankAccount[] createBankDetails(BankAccount acc) 
	{
		accountList[++index] = acc;
		return accountList;
	}
	
	public static void main(String[] args) 
	{
		BankAccountList bankAccountList = new BankAccountList();
		BankAccount accountList[] = new BankAccount[5];
		accountList = bankAccountList.createBankDetails(new SavingsAccount("Abhrak",15505));
		accountList = bankAccountList.createBankDetails(new SavingsAccount("Kaushik",55505));
		accountList = bankAccountList.createBankDetails(new SavingsAccount("Soma",25505));
		for(BankAccount list : accountList)
		{
			System.out.println("Details: "+"[accountNo=" + list.getAccountNo() + ", accountHolderName=" + list.getAccountHolderName() + ", accountBalance="
					+ list.getAccountBalance()+ "]");
		}
		
	}
}
