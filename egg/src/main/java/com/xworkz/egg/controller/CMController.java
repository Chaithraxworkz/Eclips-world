package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDTO;
import com.xworkz.egg.services.CMService;

@Controller
@RequestMapping("/cm")
public class CMController 
{
	@Autowired
	private CMService cmService;
	
	public CMController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCm(CMDTO dto ,Model model) 
	{
		System.out.println("running the onCm in controller" +dto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(dto);
		if (!constraintViolations.isEmpty())
		{
			System.out.println("validation failed,display err message");
			constraintViolations.forEach((cv)->System.err.println(cv.getMessage()));
		}
		else
		{
			System.out.println("validation success,display success message");
		}
		return "CM.jsp";
	}
}
