package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.services.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentinerController 
{
	@Autowired
	private ValentineService valentineService;
	
	 private List<String> places = Arrays.asList("park","Restorent","Lal Bagh","LongDrive","JP Nagar");
	
	 private List<String> gifts = Arrays.asList("Teddy","Ring","Chocolate","Rose","IPhone","Bangales");
	
	public ValentinerController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@GetMapping
	public String onValentine(Model model) 
	{
		System.out.println("running the onValentine in controller....");
		List<String> places = Arrays.asList("park","Restorent","Lal Bagh","LongDrive","JP Nagar");
		List<String> gifts = Arrays.asList("Teddy","Ring","Chocolate","Rose","IPhone","Bangales");
		model.addAttribute("places",places);
		model.addAttribute("gifts",gifts);
		return "Valentine";
	}
	@PostMapping
	public String onValentine(ValentineDTO dto,Model model) 
	{
		System.out.println("running the onValentine in post mapping..."+ dto);
		Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
		if(violations.isEmpty())
		{
			System.out.println("no violetions is comes in the controller go to success page");
			return "ValentineSuccess";
		}
		model.addAttribute("places",places);
		model.addAttribute("gifts",gifts);
		model.addAttribute("errors",violations);
		model.addAttribute("dto",dto);
		System.err.println("violation in controller");
		return "Valentine";
	}
}
