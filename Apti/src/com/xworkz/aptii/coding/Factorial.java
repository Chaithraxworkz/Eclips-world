package com.xworkz.aptii.coding;

public class Factorial {

	public static void main(String[] args) 
	{
		int a=8;
		int result=1;
		for(int i=a ; i>1 ; i--)
		{
			result=result * i;
		}
		System.out.println("factorial of " + a + " is :"  + result);
	}

}
