package com.capgemini.bank2;

import com.capgemini.bank.SavingsAccount;
import com.capgemini.policy.PolicyDetails;

public class SavingsAccount2 extends SavingsAccount implements PolicyDetails
{
	public SavingsAccount2() 
	{
		
	}
	
	public SavingsAccount2(String accountHolderName, double accountBalance) 
	{
		super(accountHolderName,accountBalance);
	}

	public void withdraw(double amount)
	{
		if(amount <= accountBalance)
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
	
	public void deposit(double amount)
	{
		accountBalance += amount;
		System.out.println("Current Balance= Rs."+accountBalance);
	}
	
	@Override
	public void isSalaryAccount() 
	{
		System.out.println("Salary Account");
	}

	@Override
	public void getName() 
	{
		System.out.println("My Insurance");
	}

	@Override
	public void getTime() 
	{
		System.out.println("Duration is 3 months");
	}

	@Override
	public void amount() 
	{
		System.out.println("10000");
	}

}
