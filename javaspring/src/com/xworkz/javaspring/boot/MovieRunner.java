package com.xworkz.javaspring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.javaspring.bean.Assistant;
import com.xworkz.javaspring.bean.Battery;
import com.xworkz.javaspring.bean.Camera;
import com.xworkz.javaspring.bean.CameraMan;
import com.xworkz.javaspring.bean.Company;
import com.xworkz.javaspring.bean.Director;
import com.xworkz.javaspring.bean.Experience;
import com.xworkz.javaspring.bean.Location;
import com.xworkz.javaspring.bean.Movie;
import com.xworkz.javaspring.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args)
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie movie = container.getBean(Movie.class);
		movie.Moviedirector();
		
		Director director = container.getBean(Director.class);
		director.Director();
		
		Experience exp = container.getBean(Experience.class);
		exp.Experience();
		
		CameraMan man = container.getBean(CameraMan.class);
		man.CameraMan();
		
		Camera refOfCamera = container.getBean(Camera.class);
		refOfCamera.Camera();
		
		Battery refOfBattery = container.getBean(Battery.class);
		refOfBattery.Batterycharge();
		
		Assistant refOfAssistant = container.getBean(Assistant.class);
		refOfAssistant.CompanyAssistant();
		
		Company refOfCompany = container.getBean(Company.class);
		refOfCompany.CompanyLocation();
		
		Location refOfLocation = container.getBean(Location.class);
		refOfLocation.AreaOfLocation();
		
		
	}

}
