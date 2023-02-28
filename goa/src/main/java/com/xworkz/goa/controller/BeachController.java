package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/submit")
public class BeachController 
{
	public BeachController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	private void onBeach(BeachDTO dto) 
	{
		System.out.println("Running beach:"+ dto);
	}
}
