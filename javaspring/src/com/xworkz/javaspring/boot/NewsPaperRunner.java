package com.xworkz.javaspring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.javaspring.bean.Engine;
import com.xworkz.javaspring.bean.Ghost;
import com.xworkz.javaspring.bean.NewsPaper;
import com.xworkz.javaspring.bean.Snake;
import com.xworkz.javaspring.configuration.NewsConfiguration;

public class NewsPaperRunner 
{

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(NewsConfiguration.class);
		
		NewsPaper refOfPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfPaper);
		
		System.out.println("~~~~~~~~~~~~~Engine~~~~~~~~~~~~~~~");
		Engine ref = container.getBean(Engine.class);
		System.out.println(ref);
		
		System.out.println("~~~~~~~~~~~~~~~~~Snake~~~~~~~~~~~~");
		Snake havu = container.getBean(Snake.class);
		System.out.println(havu);
		
		System.out.println("~~~~~~~~~~~~~~~~~Ghost~~~~~~~~~~~~");
		Ghost refOfGhost = container.getBean(Ghost.class);
		System.out.println(refOfGhost);
	}

}
