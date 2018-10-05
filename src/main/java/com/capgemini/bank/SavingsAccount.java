package com.capgemini.bank;

public class SavingsAccount extends BankAccount
{
	public SavingsAccount() 
	{
		
	}
	
	public SavingsAccount(String accountHolderName, double accountBalance) 
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

}
