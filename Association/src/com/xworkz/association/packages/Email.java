package com.xworkz.association.packages;

public class Email 
{
	public String id;
	public String password;
	public long mobileNo;
	public Company company;
	
	public Email(String id, String password, long mobileNo, Company company) 
	{
		super();
		this.id = id;
		this.password=password;
		this.mobileNo = mobileNo;
		this.company = company;
	}

	public void showOff()
	{
		System.out.println("details of the email");
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		if(this.company!=null)
		{
			
			company.showOff();
		}
	}
	
	
}
