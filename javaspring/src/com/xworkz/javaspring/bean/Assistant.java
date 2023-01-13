package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant 
{
	@Autowired
	private Company company;
	
	public Assistant() 
	{	
		System.out.println("create the company no-arg const");
	}
	public void CompanyAssistant()
	{
		System.out.println("Hashcode reference :" + company.hashCode());
	}
}
