package com.xworkz.collections.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO>
{
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private weaponType type;
	
	public WeaponDTO() 
	{
		
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, weaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null)
		{
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO dto = (WeaponDTO)obj;
				if(dto.name.equals(this.name))
				{
					System.out.println("running the equals method");
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int hashCode() 
	{
		return 20;
	}
	@Override
	public int compareTo(WeaponDTO o) 
	{
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public double getPrice() {
		return price;
	}

	public weaponType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(weaponType type) {
		this.type = type;
	}
	
}
