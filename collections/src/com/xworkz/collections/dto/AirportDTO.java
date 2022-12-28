package com.xworkz.collections.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable
{
	private String Location;
	private String flightNo;
	private int noOfEmployees;
	
	public AirportDTO() 
	{
		System.out.println("Enter the airport details");
	}

	public AirportDTO(String location, String flightNo, int noOfEmployees) {
		super();
		Location = location;
		this.flightNo = flightNo;
		this.noOfEmployees = noOfEmployees;
	}
	

	@Override
	public String toString() {
		return "AirportDTO [Location=" + Location + ", flightNo=" + flightNo + ", noOfEmployees=" + noOfEmployees + "]";
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("running the equals method");
		if(obj!=null)
		{
			if(obj instanceof AirportDTO)
			{
				AirportDTO dto = (AirportDTO)obj;
				if(dto.Location.equals(this.Location))
				{
					System.out.println("Location is matching :"+ this.Location);
					return true;
				}
			}
			else 
			{
				System.out.println("Location dosn't match :" +this.Location);
			}
		}
		return false;
	}
}
