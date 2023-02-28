package com.xworkz.goa.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{
	public GoaWebInit() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		System.out.println("getServletConfigClasses");
		Class[] cls = {GoaConfiguration.class};
		System.out.println(cls);
		return null;
	}

	@Override
	protected String[] getServletMappings() 
	{
		System.out.println("getServletMappings");
		String[] kmf= {"/"};
		System.out.println(kmf);
		return null;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	{
		System.out.println("running the configureDefaultServletHandling");
		configurer.enable();
	}
}
