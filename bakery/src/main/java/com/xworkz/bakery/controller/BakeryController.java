package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;


@Controller
@RequestMapping("/snaks")
public class BakeryController
{
	@Autowired
	private BakeryService bakeryService;

	public BakeryController() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onBakery(BakeryDTO bakeryDTO, Model model) 
	{
		System.out.println("running the bakery" + bakeryDTO);
		model.addAttribute("name", bakeryDTO.getName());
		model.addAttribute("ownerName", bakeryDTO.getOwnerName());
		model.addAttribute("ownerWifeName", bakeryDTO.getOwnerWifeName());
		model.addAttribute("famousFor", bakeryDTO.getFamousFor());
		model.addAttribute("since", bakeryDTO.getSince());
		model.addAttribute("married", bakeryDTO.getMarried());
		boolean ref = this.bakeryService.validateAndSave(bakeryDTO);
		System.out.println("ref" + ref);
		return "bakerySuccess.jsp";

	}
}
