package com.capgemini.bank2;

import com.capgemini.bank.BankAccount;

public class CurrentAccount extends BankAccount
{
	public CurrentAccount() 
	{
		
	}
	
	public CurrentAccount(String accountHolderName, double accountBalance) 
	{
		super(accountHolderName,accountBalance);
	}
	
	public void withdraw(double amount)
	{
		final int overDraftLimit = 1500;
		if(amount <= accountBalance)
		{
			accountBalance -= amount;
			System.out.println("Current Balance= Rs."+accountBalance);
		}
		else
		{
			if(amount <= overDraftLimit)
			{
				accountBalance -= amount;
				System.out.println("Current Balance= Rs."+accountBalance);
			}	
			else
			{
				System.out.println("Amount desired to be withdrawn is greater than your account balance");
				System.out.println("Current Balance= Rs."+accountBalance);
			}
		}

	}
	
	public void deposit(double amount)
	{
		accountBalance += amount;
		System.out.println("Current Balance= Rs."+accountBalance);
	}

	@Override
	public void isSalaryAccount() 
	{
		System.out.println("Not Salary Account");
	}
}
