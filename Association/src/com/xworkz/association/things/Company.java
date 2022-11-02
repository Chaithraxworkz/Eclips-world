package com.xworkz.association.things;

public class Company 
{
	public String name="TCS";
public Employee obj=new Employee("Chaithra", 101, 50000, "Mysore", 9542103451L, "UK", 620146, false);
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.role);
		System.out.println(obj.salary);
		System.out.println(obj.address);
		System.out.println(obj.phoneNo);
		System.out.println(obj.country);
		System.out.println(obj.pinCode);
		System.out.println(obj.anotherBranch);
		
		System.out.println(obj.getRole());
		obj.setRole("Manager");
		
	}
}
