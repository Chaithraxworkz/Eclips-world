package com.xworkz.abstraction;

public abstract class Atm 
{
	public abstract void withdraw();
	
	public void checkBalance()
	{
		System.out.println("Calling check balance method withdraw");
	}
}
