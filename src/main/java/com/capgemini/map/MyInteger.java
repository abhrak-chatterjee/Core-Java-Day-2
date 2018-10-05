package com.capgemini.map;

public class MyInteger 
{
	int number;
	
	public MyInteger(int number) 
	{
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "number=" + number;
	}

	public int getNumber() {
		return number;
	}
	
	
}
