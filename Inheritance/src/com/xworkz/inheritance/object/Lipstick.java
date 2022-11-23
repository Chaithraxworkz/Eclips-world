package com.xworkz.inheritance.object;

public class Lipstick 
{
	private String brand;
	private String name;
	private double price;
	private double quantity;
	private String color;
	private String type;
	private int rating;
	private double expDate;
	private String gram;
	private boolean carry;
	
	public Lipstick()
	{
		System.out.println("details of the lipstick");
	}
	
	public Lipstick(String brand, String name, double price, double quantity, String color, String type, int rating,
			double expDate, String gram, boolean carry) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.type = type;
		this.rating = rating;
		this.expDate = expDate;
		this.gram = gram;
		this.carry = carry;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Lipstick)
		{
			Lipstick stick=(Lipstick)obj;
			if(this.brand.equals(stick.brand) && this.expDate.equals(stick.expDate) && this.gram.equals(stick.gram) && this.price.equals(stick.price
			this.type.equals(stick.type) && this.color.equals(stick.color) && this.quantity.equals(stick.quantity) && this.rating.equals(stick.rating)))
			{
				System.out.println("Can check the lipstick");
				return true;
			}
			else
			{
				System.out.println("It is not a lipstick");
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", color=" + color + ", type=" + type + ", rating=" + rating + ", expDate=" + expDate + ", gram="
				+ gram + ", carry=" + carry + "]";
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getExpDate() {
		return expDate;
	}

	public void setExpDate(double expDate) {
		this.expDate = expDate;
	}

	public String getGram() {
		return gram;
	}

	public void setGram(String gram) {
		this.gram = gram;
	}

	public boolean getCarry() {
		return carry;
	}

	public void setCarry(boolean carry) {
		this.carry = carry;
	}
	
	
	
}
