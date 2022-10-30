package com.xworkz.Association.thing;

public class Name
{
	public String currentNme;  
	public String oldName;
	public String featureName;
	
	public Name(String currentNme, String oldName, String featureName)
	{
		super();
		this.currentNme = currentNme;
		this.oldName = oldName;
		this.featureName = featureName;
	}
	public void display()
	{
		System.out.println(this.currentNme);
		System.out.println(this.oldName);
		System.out.println(this.featureName);
	}
	
}
