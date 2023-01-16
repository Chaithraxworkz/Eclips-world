package com.xworkz.crocodile.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crocodile.PetrolBunk;
import com.xworkz.crocodile.bean.Shell;
import com.xworkz.crocodile.configuration.PetrolConfiguration;

public class Runner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		PetrolBunk shell = container.getBean(PetrolBunk.class);
		shell.purchase();
	}

}
