package com.xworkz.collections.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable
{
	private String name;
	private String location;
	private int builtBy;
	private boolean destroyed;
	private int visitingFees;
	
	public PalaceDTO() 
	{
		System.out.println("enter the ditails of palaceDTO");
	}

	public PalaceDTO(String name, String location, int builtBy, boolean destroyed, int visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getBuiltBy() {
		return builtBy;
	}

	public boolean getDestroyed() {
		return destroyed;
	}

	public int getVisitingFees() {
		return visitingFees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBuiltBy(int builtBy) {
		this.builtBy = builtBy;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public void setVisitingFees(int visitingFees) {
		this.visitingFees = visitingFees;
	}
	
	
	
}
