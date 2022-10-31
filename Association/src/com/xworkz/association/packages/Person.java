package com.xworkz.association.packages;

public class Person 
{
	public String name;
	public Email[] emails;
	public Job job=new Job("Developer", 3.5, false);
	
	public Person(String name,Email[] email,Job job)
	{
		this.name=name;
		this.emails=email;
		this.job=job;
	}
	public void showOff()
	{
		System.out.println("Enter the deails of the person");
		System.out.println(this.name);
		if(this.emails!=null)
		{
			for (int i = 0; i < this.emails.length; i++) 
			{
				Email email =this.emails[i];
				
				if(email!=null)
				{
					email.showOff();
				}
			}
		}
	}
}
