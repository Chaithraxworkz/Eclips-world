package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Cold")
public class Season 
{
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() 
	{
		
	}
	@Value("Winter")
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String getName() 
	{
		return name;
	}
	@Value("4")
	public void setDuration(String duration) 
	{
		this.duration = duration;
	}
	public String getDuration() 
	{
		return duration;
	}
	@Value("November")
	public void setStartingMonth(String startingMonth) 
	{
		this.startingMonth = startingMonth;
	}
	public String getStartingMonth()
	{
		return startingMonth;
	}
}
