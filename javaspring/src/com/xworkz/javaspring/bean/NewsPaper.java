package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper 
{
	@Value("248")
	private int id;
	private String name;
	private String ownerName;
	@Value("Kannada")
	private String language;
	private double price;
	
	public NewsPaper(@Qualifier("papername") String name,@Qualifier("paperOwnername") String ownerName) 
	{
		super();
		this.name = name;
		this.ownerName = ownerName;
		
	}

	@Override
	public String toString() 
	{
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	
	@Value("5")
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
}
