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
	private String onSend(@RequestParam String name, @RequestParam String type, @RequestParam String quantity,
			@RequestParam String price) 
	{
		System.out.println("Running to onSend :");
		System.out.println("foodname :"+ name);
		System.out.println("type :" + type);
		System.out.println("Quantity :" + quantity);
		System.out.println("Price :" + price);
		return "index.jsp";
	}
}
