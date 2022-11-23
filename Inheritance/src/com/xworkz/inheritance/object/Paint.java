package com.xworkz.inheritance.object;

public class Paint 
{
	private String brand;
	private String name;
	private double price;
	private double quantity;
	private String color;
	private String type;
	private String products;
	private String location;
	private boolean quality;
	
	public Paint()
	{
		
	}

	public Paint(String brand, String name, double price, double quantity, String color, String type, String products,
			String location,boolean quality) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.type = type;
		this.products = products;
		this.location = location;
		this.quality=quality;
	}
	@Override
	public boolean equals(Object obj)
	{
		
		if(obj instanceof Paint)
		{
			Paint casted=(Paint) obj;
			if(this.color.equals(casted.color)&& this.type.equals(casted.type))
			{
				System.out.println("printing values will be same");
				return true;
				
			}
			else
			{
				System.out.println("It is not a paint");
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", color="
				+ color + ", type=" + type + ", products=" + products + ", location=" + location + ", quality="
				+ quality + "]";
	}

	public String getBrand()
	{
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}
}
