package com.xworkz.association.packages;

public class Job 
{
	public String role;
	public double salary;
	public boolean bond;
	
	
	public Job(String role,double salary,boolean bond)
	{
		this.role=role;
		this.salary=salary;
		this.bond=bond;
		
	}
	public void showOff()
	{
		System.out.println("Enter the details of the job");
		System.out.println(this.role);
		System.out.println(this.salary);
		System.out.println(this.bond);
		
	}
}
