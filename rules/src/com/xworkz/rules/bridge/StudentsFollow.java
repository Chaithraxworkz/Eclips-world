package com.xworkz.rules.bridge;

import com.xworkz.rules.College;

public class StudentsFollow implements College
{
	@Override
	public String collegePrincipal() 
	{
		System.out.println("Principal is : Ramayya");
		return null;
	}
	@Override
	public String locationOfCollege() 
	{
		System.out.println("Location is : Bhadravthi");
		return null;
	}
	
	@Override
	public String studentName() 
	{
		System.out.println("Name is : Srusti");
		return null;
	}
	
	@Override
	public boolean wearIdCard()
	{
		return false;
	}
	
	@Override
	public boolean wearUniform() 
	{
		return true;
	}
	 @Override
	public long studentPhoneNo() 
	 {
		 System.out.println("PhoneNo is : 9754120680L");
		return 0;
	}
}
