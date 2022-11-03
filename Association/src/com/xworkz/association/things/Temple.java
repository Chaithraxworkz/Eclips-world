package com.xworkz.association.things;

public class Temple 
{
	public String name="Tirupati";
	God god=new God();
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(god.getName());
		god.setName(name);
		System.out.println(god.getNoOfPeople());
		god.setNoOfPeoples(10000);
		System.out.println(god.getAstra());
		god.setAstra("Sri chakra");
		System.out.println(god.getLocation());
		god.setLocation("tamilnadu");
		System.out.println(god.getNoOfPujari());
		god.setNoOfPujaris(30);
		System.out.println(god.getCountry());
		god.setCountry("India");
		
	}
}
