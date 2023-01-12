package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake 
{
	private String name;
	@Value("6.5")
	private double length;
	@Value("Black")
	private String color;
	private String type;
	private boolean possionous;
	
	public Snake(@Qualifier("snakeName") String name,@Qualifier("snakeType") String type,@Qualifier("Possion") boolean possionous) {
		super();
		this.name = name;
		this.type = type;
		this.possionous = possionous;
	}

	@Override
	public String toString() 
	{
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", possionous="
				+ possionous + "]";
	}
	
}
