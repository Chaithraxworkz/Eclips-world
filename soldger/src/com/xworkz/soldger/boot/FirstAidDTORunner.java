package com.xworkz.soldger.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldger.configure.SpringConfiguration;
import com.xworkz.soldger.dto.FirstAidDTO;
import com.xworkz.soldger.service.FirstAidService;

public class FirstAidDTORunner 
{

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved" +saved);
	}

}
