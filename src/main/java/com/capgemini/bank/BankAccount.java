package com.capgemini.bank;

/** this comment is document based comment
 * 
 * @author Abhrak Chatterjee
 * @since 03-10-2018
 */

public class BankAccount implements Comparable<BankAccount>
{
	public int accountNo;
	public String accountHolderName;
	public double accountBalance;
	public static int autoAccountNoGen;
	
	{
		accountNo = ++autoAccountNoGen;			// init block. initializaion happens before constructor
	}
	
	public BankAccount() 
	{
		accountHolderName = "Unknown";
		accountBalance = 10000;
	}

	public BankAccount(String accountHolderName, double accountBalance) 
	{
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNo() 
	{
		return accountNo;
	}

	public double getAccountBalance() 
	{
		return accountBalance;
	}

	/*abstract public void withdraw(double amount);
	
	abstract public void deposit(double amount);

	public abstract void isSalaryAccount();*/

	@Override
	public String toString() {
		return " [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	@Override
	public int compareTo(BankAccount account) 
	{
		return account.getAccountNo() - getAccountNo();
	}
	
	
}
