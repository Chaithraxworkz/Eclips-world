package com.xworks.crud.dto;

public class BakeryDTO extends AbsractAuditDTO
{
	private String name;
	private String ownerName;
	private long phoneNo;
	private String location;
	
	public BakeryDTO() 
	{
		System.out.println("Running bakery");
	}

	public BakeryDTO(String name, String ownerName, long phoneNo, String location,String createdBy) {
		super(createdBy);
		this.name = name;
		this.ownerName = ownerName;
		this.phoneNo = phoneNo;
		this.location = location;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", phoneNo=" + phoneNo + ", location="
				+ location + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
