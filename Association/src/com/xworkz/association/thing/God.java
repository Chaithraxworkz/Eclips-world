package com.xworkz.association.thing;

public class God 
{
	public String name;
	public String gender;
	public String mainPower;
	public Weapon astra=new Weapon("Trishula","Nadies",6.8);
	
	
	public God(String name,String gender,String mainPower)
	{
		this.name=name;
		this.gender=gender;
		this.mainPower=mainPower;
	}
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
	}
}
