package com.xworkz.crocodile.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.crocodile.Browser;
import com.xworkz.crocodile.bean.Chrome;
import com.xworkz.crocodile.configuration.PetrolConfiguration;

public class InternetRunner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Browser refOfChrome = container.getBean("fireBox",Browser.class);
		refOfChrome.browser();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Browser chrome = container.getBean("chrome",Browser.class) ;
		chrome.browser();
		
	}

}
