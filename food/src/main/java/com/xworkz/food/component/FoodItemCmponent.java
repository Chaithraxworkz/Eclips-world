package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/share")
public class FoodItemCmponent 
{
	public FoodItemCmponent() 
	{
		System.out.println("created the FoodItemCmponent");
	}
	@PostMapping
	private String onSend(@RequestParam String foodname, @RequestParam String type, @RequestParam int Quantity,
			@RequestParam double Price) 
	{
		System.out.println("Running to onSend :");
		System.out.println("foodname :"+ foodname);
		System.out.println("type :" + type);
		System.out.println("Quantity :" + Quantity);
		System.out.println("Price :" + Price);
		return "FoodItem.jsp";
	}
}
