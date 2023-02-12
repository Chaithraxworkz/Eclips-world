package com.xworkz.egg.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{
	public EggApplicationInit() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		System.out.println("running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		System.out.println("running the getServletConfigClasses");
		return new Class[] {EggApplicationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		System.out.println("running the getServletMappings");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	{
		System.out.println("running the configureDefaultServletHandling");
		configurer.enable();
	}
}
