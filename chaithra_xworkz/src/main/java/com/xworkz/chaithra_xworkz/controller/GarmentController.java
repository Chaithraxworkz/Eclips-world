package com.xworkz.chaithra_xworkz.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.chaithra_xworkz.dto.GarmentDTO;
import com.xworkz.chaithra_xworkz.service.GarmentService;

@Controller
@RequestMapping("/")
public class GarmentController 
{
	@Autowired
	private GarmentService service;
	
	private List<Integer> noOfEmployees = Arrays.asList(5,15,20,27,38,60,100,400);
	
	public GarmentController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@GetMapping("/fashion")
	public  String onGarment(Model model) 
	{
		System.out.println("Running in controller");
		model.addAttribute("noOfEmployees",noOfEmployees);
		return "Garment";
	}
	
	@PostMapping("/fashion")
	public String onFun(Model model, GarmentDTO dto)
	{
		System.out.println("Running onAir in post in controller");
		Set<ConstraintViolation<GarmentDTO>> violations = this.service.validateAndSave(dto);
		if (violations.isEmpty())
		{
			System.out.println("no violations in controller,goto next page");
			
			return "Garment";

		}
		model.addAttribute("noOfEmployees", noOfEmployees);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("violations in controller");
		return "Garment";

	}
	@GetMapping("/find")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("Running on Search for id"+id);
		GarmentDTO dto=this.service.findById(id);
		if(dto!=null) 
		{
			model.addAttribute("dto",dto);
			
		}
		else 
		{
			model.addAttribute("message", "data not Found");
		}
		return "GarmentSearch";
		
	}
}
