package com.xworkz.collections.dto;

public class PlaceDTO 
{
	private String name;
	private String famous;
	private int noOfVisitors;
	
	public PlaceDTO() 
	{
		System.out.println("enter the place details");
	}

	public PlaceDTO(String name, String famous, int noOfVisitors) {
		super();
		this.name = name;
		this.famous = famous;
		this.noOfVisitors = noOfVisitors;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famous=" + famous + ", noOfVisitors=" + noOfVisitors + "]";
	}
	@Override
	public boolean equals(Object dto)
	{
		System.out.println("running the equals method");
		if(dto!=null)
		{
			if(dto instanceof PlaceDTO)
			{
				PlaceDTO place = (PlaceDTO)dto;
				if(place.famous.equals(famous))
				{
					System.out.println("Maching the famouse of the place :" +this.famous);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamous() {
		return famous;
	}

	public void setFamous(String famous) {
		this.famous = famous;
	}

	public int getNoOfVisitors() {
		return noOfVisitors;
	}

	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}
	
}
