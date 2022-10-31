package com.xworkz.association.thing;

public class Temple
{
	public String name;
	public String mainPriest;
	public int noOfVisitor;
	public double collectionPerDay;
	public God god=new God("Shiva","Male","Lord of Cattle");
	
	
	public Temple(String name, String god, String mainPriest, int noOfVisitor, double collectionPerDay) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitor = noOfVisitor;
		this.collectionPerDay = collectionPerDay;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitor);
		System.out.println(this.collectionPerDay);
		
	}
	
}
