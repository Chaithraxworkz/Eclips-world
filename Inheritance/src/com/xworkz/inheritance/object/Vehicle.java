package com.xworkz.inheritance.object;

import java.util.Vector;

public class Vehicle 
{
	private String brand;
	private String name;
	private double price;
	private String color;
	private double milage;
	private boolean petrol;
	private int invented;
	private String manufacture;
	private String inventor;
	private double weight;
	
	public Vehicle()
	{
		System.out.println("print the vechiles details");
	}
	
	public Vehicle(String brand, String name, double price, String color, double milage, boolean petrol, int invented,
			String manufacture, String inventor, double weight) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
		this.milage = milage;
		this.petrol = petrol;
		this.invented = invented;
		this.manufacture = manufacture;
		this.inventor = inventor;
		this.weight = weight;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Vehicle)
		{
			Vehicle vehicle=(Vehicle)obj;
			if(this.name.equals(vehicle.name)&& this.inventor.equals(vehicle.inventor) && this.manufacture.equals(vehicle.manufacture))
			{
				System.out.println("It ia a new car");
				return true;
			}
		}
		else
		{
			System.out.println("it is not a car");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", name=" + name + ", price=" + price + ", color=" + color + ", milage="
				+ milage + ", petrol=" + petrol + ", invented=" + invented + ", manufacture=" + manufacture
				+ ", inventor=" + inventor + ", weight=" + weight + "]";
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getMilage() {
		return milage;
	}


	public void setMilage(double milage) {
		this.milage = milage;
	}


	public boolean isPetrol() {
		return petrol;
	}


	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}


	public int getInvented() {
		return invented;
	}


	public void setInvented(int invented) {
		this.invented = invented;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public String getInventor() {
		return inventor;
	}


	public void setInventor(String inventor) {
		this.inventor = inventor;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
