package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop 
{
	@Autowired
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gross")
	private String gstNo;
	@Autowired
	@Qualifier("shopOwner")
	private String ownerName;
	@Autowired
	@Qualifier("stala")
	private String address;
	
	public HardwareShop() 
	{
		System.out.println("Running the HardwareShop");
	}
	
	@Override
	public String toString() 
	{
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}


	
}
