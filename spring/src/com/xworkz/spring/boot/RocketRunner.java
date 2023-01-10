package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;
import com.xworkz.spring.bean.Season;
import com.xworkz.spring.configuration.RocketConfiguration;

public class RocketRunner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(RocketConfiguration.class);
		Rocket refOfRocket = container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		
		Rocket refOfRocket2 = container.getBean("isro",Rocket.class);
		System.out.println(refOfRocket2);
		System.out.println(refOfRocket2.getBudget());
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		
		
		Actor refOfActor = container.getBean("Yash",Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());
		
		Actor refOfActor2 = container.getBean("hero",Actor.class);
		System.out.println(refOfActor2);
		System.out.println(refOfActor2.getAge());
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getLanguage());
		
		
		Season refOfSeason = container.getBean("Cold",Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMonth());
		
		Season refOfSeason2 = container.getBean("summer",Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getStartingMonth());
		System.out.println(refOfSeason2.getDuration());
		System.out.println(refOfSeason2.getName());
		
	}

}
