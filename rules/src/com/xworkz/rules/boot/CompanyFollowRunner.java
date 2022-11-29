package com.xworkz.rules.boot;

import com.xworkz.rules.Company;
import com.xworkz.rules.bridge.CompanyFollows;

public class CompanyFollowRunner {

	public static void main(String[] args) 
	{
		CompanyFollows company=new CompanyFollows();
		company.nameOfCompany();
		company.locationOfCompany();
		company.noOfEmployees();
		company.modeOfCompany();
		company.rulesOfCompany();
		
		System.out.println("-----------------------------------------------------------------");
		
		Company company2=new CompanyFollows();
		company2.nameOfCompany();
		company2.locationOfCompany();
		company2.noOfEmployees();
		company2.modeOfCompany();
		company2.rulesOfCompany();
	}

}
