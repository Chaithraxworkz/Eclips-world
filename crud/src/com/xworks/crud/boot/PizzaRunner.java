package com.xworks.crud.boot;

import java.time.LocalDateTime;

import com.xworks.crud.constant.PizzaSize;
import com.xworks.crud.dto.PizzaDTO;
import com.xworks.crud.service.PizzaService;
import com.xworks.crud.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) 
	{
		PizzaDTO dto=new PizzaDTO("Golden Corn", "Pizza Hot" , PizzaSize.MEDIUM,  true, 150 , "Spicy", "veg" );
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy( "SYSTEM");
		dto.setUpdatedDate(LocalDateTime.now());
		PizzaService service=new PizzaServiceImpl();
		service.validateandsave(dto);
		
	}

}
