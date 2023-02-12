package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.services.EggService;

@Controller
@RequestMapping("/egg")
public class EggController 
{
	@Autowired
	private EggService eggService;
	
	public EggController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onController(EggDTO dto,Model model) 
	{
		System.out.println("running the onController" +dto);
		boolean saved = this.eggService.validateAndSave(dto);
		System.out.println("saved" + saved);
		return "index.jsp";
	}
}
