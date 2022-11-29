package com.xworkz.rules.boot;

import com.xworkz.rules.Bank;
import com.xworkz.rules.bridge.CustomerFollow;

public class CustomerFollowRunner {

	public static void main(String[] args) 
	{
		CustomerFollow follow=new CustomerFollow();
		follow.nameOfBank();
		follow.locationOfBank();
		follow.amountCredit();
		follow.amountDeposit();
		follow.customername();
		
		Bank bank=new CustomerFollow();
		bank.nameOfBank();
		bank.locationOfBank();
		bank.amountCredit();
		bank.amountDeposit();
		bank.customername();
	}

}
