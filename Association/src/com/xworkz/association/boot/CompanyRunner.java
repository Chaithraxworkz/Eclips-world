package com.xworkz.association.boot;

import com.xworkz.association.things.Company;
import com.xworkz.association.things.Employee;

public class CompanyRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu....");
		Company company=new Company();
		Employee obj=new Employee("Chaithra", 101, 50000, "Mysore", 9542103451L, "UK", 620146, false);
		
		System.out.println(company.name);
		System.out.println(company.obj);
		System.out.println(obj.getRole());
		
		company.display();
	}

}
