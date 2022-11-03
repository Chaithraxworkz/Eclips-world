package com.xworkz.association.things;

public class Dog 
{
	public String d_Name="Dora";
	public Pet pet=new Pet();
	
	public void showOff()
	{
		System.out.println(this.d_Name);
		if(this.pet!=null)
		{
			System.out.println(pet.getFood());
			pet.setFood("pedigree");
			System.out.println("dog food"+pet.getFood());
			
			System.out.println(pet.getWeight());
			pet.setWeight(5.6);
			System.out.println("weight"+pet.getWeight());
			
			System.out.println(pet.getColor());
			pet.setColor("White");
			System.out.println("Color"+pet.getColor());
			
			System.out.println(pet.getHeight());
			pet.setHeight(2.5);
			System.out.println("Height"+pet.getHeight());
			
			System.out.println(pet.getName());
			pet.setName("Browny");
			System.out.println("name"+pet.getName());
			
			System.out.println(pet.getOwnerName());
			pet.setOwnerName("Deepu");
			System.out.println("Ownername"+pet.getOwnerName());
			
			System.out.println(pet.getPhNo());
			pet.setPhNo(9542310546L);
			System.out.println("Owner Phone No"+ pet.getPhNo());
			
			System.out.println(pet.getAddress());
			pet.setAddress("Mysore");
			System.out.println("Address"+pet.getAddress());
			
			System.out.println(pet.getWalking());
			pet.setWalking(true);
			System.out.println("Walking"+pet.getWalking());
			
		}
	}
}
