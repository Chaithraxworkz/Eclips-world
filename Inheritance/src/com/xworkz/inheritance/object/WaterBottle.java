package com.xworkz.inheritance.object;

public class WaterBottle 
{
	private String brand;
	private String name;
	private double price;
	private String color;
	private String liter;
	private String type;
	private String design;
	private double weight;
	private boolean hotWater;
	private double expDate;
	
	public WaterBottle()
	{
		System.out.println("details of waterbottle");
	}
	
	
	public WaterBottle(String brand, String name, double price, String color, String liter, String type, String design,
			double weight, boolean hotWater, double expDate) 
	{
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
		this.liter = liter;
		this.type = type;
		this.design = design;
		this.weight = weight;
		this.hotWater = hotWater;
		this.expDate = expDate;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof WaterBottle)
		{
			WaterBottle bottle=(WaterBottle)obj;
			if(this.design.equals(bottle.design) && this.type.equals(bottle.type) && this.color.equals(bottle.color))
			{
				System.out.println("Bottle is purefiy ");
				return true;
			}
			else
			{
				System.out.println("Bottle is not purefy");
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() 
	{
		return "WaterBottle [brand=" + brand + ", name=" + name + ", price=" + price + ", color=" + color + ", liter="
				+ liter + ", type=" + type + ", design=" + design + ", weight=" + weight + ", hotWater="
				+ hotWater + ", expDate=" + expDate + "]";
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



	public String getLiter() {
		return liter;
	}



	public void setLiter(String liter) {
		this.liter = liter;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDesign() {
		return design;
	}



	public void setDesign(String design) {
		this.design = design;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public boolean gethotWater() {
		return hotWater;
	}



	public void sethotWater(boolean hotWater) {
		this.hotWater = hotWater;
	}



	public double getExpDate() {
		return expDate;
	}



	public void setExpDate(double expDate) {
		this.expDate = expDate;
	}
	
	
}
