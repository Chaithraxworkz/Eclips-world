package com.xworkz.inheritance.thing;

public class Political 
{
	public String partyName;
	public int noOfMembers;
	
	public Political(String partyName, int noOfMembers)
	{
		this.partyName=partyName;
		this.noOfMembers=noOfMembers;
	}
	public void display()
	{
		System.out.println(this.partyName);
		System.out.println(this.noOfMembers);
	}
}
