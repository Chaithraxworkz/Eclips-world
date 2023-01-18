package com.xworkz.soldger.boot;

import com.xworkz.soldger.dto.SoldgerDTO;
import com.xworkz.soldger.service.SoldgerService;
import com.xworkz.soldger.service.SoldgerServiceImpl;

public class Runner {

	public static void main(String[] args) 
	{
		SoldgerDTO dtos = new SoldgerDTO("Hareesh",101,"topper","second","India");
		
		SoldgerService soldger = new SoldgerServiceImpl();
		soldger.validatedAndSave(dtos);
		
		
	}

}
