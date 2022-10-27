package com.xworkz.Association.thing;

public class Location 
{
	public String state;
	public String city;
	public int code;
	
	public Location(String state, String city, int code)
	{
		
		this.state = state;
		this.city = city;
		this.code = code;
	}
	public void showOff()
	{
		System.out.println(this.state);
		System.out.println(this.city);
		System.out.println(this.code);
	}
	
}
