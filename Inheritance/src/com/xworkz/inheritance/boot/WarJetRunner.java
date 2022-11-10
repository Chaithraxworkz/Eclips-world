package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Rafell;
import com.xworkz.inheritance.overriding.WarJet;

public class WarJetRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the main");
		WarJet jet=new Rafell();
		jet.name();
		jet.jetNo();
	}

}
