package com.xworkz.association.things;

public class ShopManager 
{
	public String name="Pavan";
	public Saree saree=new Saree("Kuberan Silks","Mysore Silk", 100000, "Blue", "Crpe Silk", 15.6, "Bangalore", 20, 4.5);
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(saree.shopName);
		System.out.println(saree.price);
		System.out.println(saree.color);
		System.out.println(saree.type);
		System.out.println(saree.weight);
		System.out.println(saree.location);
		System.out.println(saree.noOfEmployees);
		System.out.println(saree.rating);
		
		
		
		System.out.println(saree.getPhNo());
		saree.setPhNo(7995620145l);
		
		System.out.println(saree.getQuality());
		saree.setQuality("puregold zari ");
	}
	
}
