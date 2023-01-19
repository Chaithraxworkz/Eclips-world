package com.xworkz.soldger.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldger.configure.SpringConfiguration;
import com.xworkz.soldger.dto.ResortDTO;
import com.xworkz.soldger.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());
		System.out.println(saved);
	}

}
