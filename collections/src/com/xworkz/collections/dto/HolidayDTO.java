package com.xworkz.collections.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable
{
	private Types type;
	private String name;
	private int noOfHolidays;
	
	public HolidayDTO() 
	{
		System.out.println("Enter the Holiday details");
	}

	public HolidayDTO(Types type, String name, int noOfHolidays) {
		super();
		this.type = type;
		this.name = name;
		this.noOfHolidays = noOfHolidays;
	}
	

	@Override
	public String toString() {
		return "HolidayDTO [type=" + type + ", name=" + name + ", noOfHolidays=" + noOfHolidays + "]";
	}

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(int noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}
	@Override
	public boolean equals(Object days) 
	{
		System.out.println("Running the holidays");
		if(days!=null)
		{
			if(days instanceof HolidayDTO)
			{
				HolidayDTO dto = (HolidayDTO)days;
				if(dto.name.equals(name))
				{
					System.out.println("Name is mathching :" +this.name);
					return true;
				}
			}
			else
			{
				System.out.println("Name doesn't match :" +this.name);
			}
		}
		return false;
	}
}
