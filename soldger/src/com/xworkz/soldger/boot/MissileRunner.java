package com.xworkz.soldger.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldger.configure.SpringConfiguration;
import com.xworkz.soldger.dto.MissileDTO;
import com.xworkz.soldger.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		MissileService service = container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println(saved);
	}

}
