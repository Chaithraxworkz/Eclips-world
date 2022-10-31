package com.xworkz.association.packages;

public class Location 
{
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country=Country.INDIA;
	
	public Location(String street,int no,City city)
	{
		this.street=street;
		this.no=no;
		this.city=city;
	}
	public void showOff()
	{
		System.out.println("details of location");
		System.out.println(this.no);
		System.out.println(this.street);
		System.out.println(this.country);
		
		if(this.city!=null) 
		{
			
			city.showOff();
		}
		if(this.state!=null)
		{
			state.showOff();
		}
		
	}
}
