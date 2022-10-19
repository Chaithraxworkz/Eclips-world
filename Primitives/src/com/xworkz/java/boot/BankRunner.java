package com.xworkz.java.boot;

import com.xworkz.java.Bank;

public class BankRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter into main method");
		String[] headquarters= {"Mangalore","Chennai","Bangalore"};
		String[] branches= {"Channapatana","Ramanagara","Mandya"};
		String[] type= {"Government","Non-Government"};
		int[] noOfEmployees= {1400,2000,500};
		
		Bank bank=new Bank("Karnataka Bank","Hassan",7016410101852,"18-02-1924",true,headquarters,branches,type,noOfEmployees);
		bank.display();
	}

}
