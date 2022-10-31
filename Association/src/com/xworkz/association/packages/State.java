package com.xworkz.association.packages;

public class State
{
	public String name;
	public int noOfCities;
	public String capital;
	public String iso;
	
	public State(String name, int noOfCities, String capital, String iSO) 
	{
		super();
		this.name = name;
		this.noOfCities = noOfCities;
		this.capital = capital;
		iso = iSO;
	}
	public void showOff()
	{
		System.out.println("state details");
		System.out.println(this.name);
		System.out.println(this.noOfCities);
		System.out.println(this.capital);
		System.out.println(this.iso);
	}
	
}
