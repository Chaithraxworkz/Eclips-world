package com.xworkz.collections.dto;

import java.io.Serializable;

public class CalendarDTO implements Serializable
{
	private CalenderType type;
	private String brand;
	private double price;
	
	public CalendarDTO() 
	{
		System.out.println("Enter the details of the calendar");
	}

	public CalendarDTO(CalenderType type, String brand, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CalendarDTO [type=" + type + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object cal) 
	{
		System.out.println("running the equals method");
		if(cal!=null)
		{
			if(cal instanceof CalendarDTO)
			{
				CalendarDTO dtos =(CalendarDTO)cal ;
				if(dtos.brand.equals(brand));
				{
					System.out.println("brand is maching :" + this.brand);
					return true;
				}
			}
			else
			{
				System.out.println("brand does not match :" + this.brand);
			}
		}
		return false;
	}

	public CalenderType getType() {
		return type;
	}

	public void setType(CalenderType type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
