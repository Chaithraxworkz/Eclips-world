package com.xworks.crud.boot;

import java.time.LocalDateTime;

import com.xworks.crud.constant.PizzaSize;
import com.xworks.crud.dto.PizzaDTO;
import com.xworks.crud.service.PizzaService;
import com.xworks.crud.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) 
	{
		PizzaDTO dto=new PizzaDTO("Goldencorn", "Pizza Hot" , PizzaSize.MEDIUM,  true, 150 , "Spicy", "veg", "SYSTEM", LocalDateTime.now(), "SYSTEM", LocalDateTime.now());
		
		PizzaService service=new PizzaServiceImpl();
		boolean saved = PizzaService.validateAndSave(PizzaDTO);
		System.out.println(saved);
	}

}
