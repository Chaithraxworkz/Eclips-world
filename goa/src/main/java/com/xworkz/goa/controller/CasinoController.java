package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/send")
public class CasinoController 
{
	public CasinoController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	private String onCasino(CasinoDTO casinoDTO,Model model) 
	{
		System.out.println("Running Casino" +casinoDTO);
		model.addAttribute("Name",casinoDTO.getName());
		model.addAttribute("Price",casinoDTO.getEntryFee());
		model.addAttribute("Cruise",casinoDTO.getCrusie());
		model.addAttribute("Food",casinoDTO.isFreeFood());
		model.addAttribute("Alchol",casinoDTO.isFreeAlcohal());
		
		return "CasinoSuccess.jsp";
	}
	
}
