package com.xworks.crud.boot;

import com.xworks.crud.constant.Color;
import com.xworks.crud.constant.HelmetType;
import com.xworks.crud.dto.HelmetDTO;
import com.xworks.crud.repository.HelmetRepository;
import com.xworks.crud.repository.HelmetRepositoryImpl;
import com.xworks.crud.service.HelmetService;
import com.xworks.crud.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) 
	{
		HelmetDTO dto=new HelmetDTO("Hero", HelmetType.HALF, 700D, Color.GREY);
		HelmetRepository repo=new HelmetRepositoryImpl();
		
		HelmetService service=new HelmetServiceImpl(repo);
		boolean success=service.validateAndSave(dto);
		System.out.println("Success :" +success);
		
		
	}

}
