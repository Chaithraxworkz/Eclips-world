package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SoftwareCompanyNameRunner {

	public static void main(String[] args) 
	{
		String company1 = "Wipro";
		String company2 = "Accenture";
		String company3 = "Infosys";
		String company4 = "TCS";
		String company5 = "IBM";
		String company6 = "HCL";
		String company7 = "Mindtree";
		String company8 = "Oracle";
		String company9 = "Amazon";
		String company10 = "Dell";
		String company11 = "Hp";
		String company12 = "SAP";
		String company13 = "Tec Mahindra";
		String company14 = "Cisco";
		String company15 = "Capgemini";
		String company16 = "Mphasis";
		String company17 = "Intel";
		String company18 = "Huawei";
		String company19 = "Flipcart";
		String company20 = "Deloitte";
		
		Collection<String> company = new HashSet<String>();
		company.add(company20);
		company.add(company19);
		company.add(company18);
		company.add(company17);
		company.add(company16);
		company.add(company15);
		company.add(company14);
		company.add(company13);
		company.add(company12);
		company.add(company11);
		company.add(company10);
		company.add(company9);
		company.add(company8);
		company.add(company7);
		company.add(company6);
		company.add(company5);
		company.add(company4);
		company.add(company3);
		company.add(company2);
		company.add(company1);
		company.add(null);
		System.out.println("Company List :" + company.size() );
		System.out.println(company);
		
		for(String element : company)
		{
			System.out.println(element);
		}
		System.out.println("------------------------------------------------------------------");
		Iterator<String> ref = company.iterator();
		while(ref.hasNext())
		{
			String element = ref.next();
			System.out.println(element);
		}
	}

}
