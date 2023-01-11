package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.bean.HardwareShop;
import com.xworkz.spring.bean.Mobile;
import com.xworkz.spring.bean.Pencil;
import com.xworkz.spring.bean.Rubber;
import com.xworkz.spring.bean.Software;
import com.xworkz.spring.configuration.HardwareConfiguration;

public class HardwareShopRunner 
{

	public static void main(String[] args) 
	{
		ApplicationContext application = new AnnotationConfigApplicationContext(HardwareConfiguration.class);
		String[] ref = application.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		HardwareShop hardwareShop = application.getBean(HardwareShop.class);
		System.out.println(hardwareShop);

		Software software = application.getBean(Software.class);
		System.out.println(software.toString());

		Pencil pencil = application.getBean(Pencil.class);
		System.out.println(pencil.toString());
		
		Rubber rubber=application.getBean(Rubber.class);
		System.out.println(rubber.toString());
		
		Mobile mobile=application.getBean(Mobile.class);
		System.out.println(mobile);

	}
}
