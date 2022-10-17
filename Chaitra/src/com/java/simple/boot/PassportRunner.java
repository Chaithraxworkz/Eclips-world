package com.java.simple.boot;
import com.java.simple.*;

public class PassportRunner 
{

	public static void main(String[] args)
	{
		Passport pass=new Passport("Chaithra");
		System.out.println(pass.no);
		System.out.println(pass.name);
		System.out.println(pass.country);
		System.out.println(pass.expDate);
		System.out.println(pass.issueDate);
		System.out.println(pass.noOfLeafes);
		
		pass.no=265780468;
		pass.country="Delhi";
		pass.expDate="28-05-2023";
		pass.issueDate="31-06-2022";
		pass.noOfLeafes=10;
		
		System.out.println(pass.no);
		System.out.println(pass.name);
		System.out.println(pass.country);
		System.out.println(pass.expDate);
		System.out.println(pass.issueDate);
		System.out.println(pass.noOfLeafes);
	}

}
