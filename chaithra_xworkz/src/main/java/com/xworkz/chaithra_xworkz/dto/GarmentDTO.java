package com.xworkz.chaithra_xworkz.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class GarmentDTO 
{
	private int id;
	@NotBlank(message = "Name cannot be null")
	@Size(min = 5, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String name;
	@NotBlank(message = "location cannot be null")
	@Size(min = 5, max = 25, message = "Name should be more than 5 or less than 25 characters")
	private String location;
	private int phNo;
	@NotBlank(message = "OwnerName cannot be null")
	@Size(min = 5, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String ownerName;
	private int noOfEmployees; 
}
