package com.xworkz.rules.bridge;

import com.xworkz.rules.Bank;

public class CustomerFollow implements Bank
{
	@Override
	public String nameOfBank() 
	{
		System.out.println("Canara Bank");
		return null;
	}
	@Override
	public String locationOfBank() 
	{
		System.out.println("Channapatana");
		return null;
	}
	@Override
	public boolean amountCredit() 
	{
		System.out.println(true);
		return true;
	}
	@Override
	public String amountDeposit()
	{
		System.out.println(50000);
		return null;
	}
	@Override
	public String customername() 
	{
		System.out.println("Rakesh");
		return null;
	}
}
