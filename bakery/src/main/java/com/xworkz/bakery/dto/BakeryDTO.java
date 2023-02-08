package com.xworkz.bakery.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BakeryDTO 
{
	private String name;
	private String ownerName;
	private String ownerWifeName;
	private boolean married;
	private String famousFor;
	private LocalDate since;
	
}
