package com.xworkz.things;

public class TextileShop 
{
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public double ownerDaughterNumber;
	public int ownersNoOfWifes;
	public int shopNo;
	public double contactNo;
	
	public TextileShop()
	{
		super();
		System.out.println("enter the no-arg list of TextileShop");
	}
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName)
	{
		this();
		this.ownerName=ownerName;
		this.ownerWifeName=ownerWifeName;
		this.ownerDaughterName=ownerDaughterName;
	}
	public TextileShop(String ownerWifeName,double shopNo)
	{
		this("Rajesh",ownerWifeName,shopNo);
		this.shopNo=shopNo;
	}
	public TextileShop(int shopNo,String ownerDaughterName,double ownerDaughternumer)
	{
		this(6492,ownerDaughterName);
		this.ownerDaughterNumber=ownerDaughterNumber;
	}
	public TextileShop(int ownerNoOfWife,String ownerDaughterNumber,double contactNo)
	{
		this(2,ownerDaughterNumber,"sonu");
		this.contactNo=contactNo;
	}
	public TextileShop(int shopNo,double contactNo)
	{
		this(2,shopNo,9756820461);
		this.contactNo=contactNo;
	}

}
