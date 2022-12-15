package com.xworks.crud.dto;

import com.xworks.crud.constant.Color;
import com.xworks.crud.constant.HelmetType;

public class HelmetDTO extends AbsractAuditDTO
{
	public String brand;
	public HelmetType type;
	public Double price;
	public Color color;
	
	public HelmetDTO() 
	{
		
	}

	public HelmetDTO(String brand, HelmetType type, Double price, Color color) 
	{
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}



	

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}



	public String getBrand() 
	{
		return brand;
	}



	public void setBrand(String brand) 
	{
		this.brand = brand;
	}



	public HelmetType getType() 
	{
		return type;
	}



	public void setType(HelmetType type) 
	{
		this.type = type;
	}



	public Double getPrice() 
	{
		return price;
	}

	
	public void setPrice(Double price) 
	{
		this.price = price;
	}



	public Color getColor() 
	{
		return color;
	}



	public void setColor(Color color) 
	{
		this.color = color;
	}
}
