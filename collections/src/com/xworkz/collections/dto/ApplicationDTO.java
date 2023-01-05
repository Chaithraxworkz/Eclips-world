package com.xworkz.collections.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable
{
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;
	
	public ApplicationDTO() 
	{
		System.out.println("enter the detailsof  ApplicationDTO");
	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public boolean isFree() {
		return free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
