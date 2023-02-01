package com.xworkz.sunlite.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{
	public SpringWebInit() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		System.out.println("Running getServletConfigClasses");
		Class[] configClass= {SpringBeanConfiguration.class};
		System.out.println("configClass :" +Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() 
	{
		System.out.println("Running getServletMappings");
		String[] str= {"/"};
		System.out.println("getServletMappings :"+ Arrays.toString(str));
		return str;
	}

}
