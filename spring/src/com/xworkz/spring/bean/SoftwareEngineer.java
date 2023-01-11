package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer 
{
	@Autowired
	@Qualifier("engineerName")
	private String name;
	@Autowired
	private double salary;
	@Autowired
	@Qualifier("softwaryCompany")
	private String companyName;
	@Autowired
	private boolean experience;
	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", experience="
				+ experience + "]";
	}
	
}
