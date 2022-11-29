package com.xworkz.rules.bridge;

import com.xworkz.rules.Management;

public class SchoolFollow implements Management
{
	@Override
	public String nameOfSchool() 
	{
		System.out.println("nameOfSchool is GovernmentHighSchool");
		return null;
	}
	@Override
	public String schoolLocation() 
	{
		System.out.println("schoolLocation is Channapatana");
		return null;
	}
	@Override
	public String chairmanOfSchool() 
	{
		System.out.println("chairmanOfSchool is AshwinDeshmukh");
		return null;
	}
	@Override
	public String principleOfSchool() 
	{
		System.out.println("principleOfSchool is Ranganath");
		return null;
	}
	@Override
	public boolean wearUniform() 
	{
		System.out.println(true);
		return false;
	}
}
