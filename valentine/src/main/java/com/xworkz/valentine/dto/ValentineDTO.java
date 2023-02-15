package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class ValentineDTO 
{
	@NotBlank(message="Name cannot be null")
	@Size(min=3,max=25,message="Name can't be less than 3 or greater than 25")
	private String name;
	@NotBlank(message="ValentineName cannot be null")
	@Size(min=3,max=20,message="ValentineName can't be less than 3 or greater than 25")
	private String valentineName;
	@NotBlank(message="place should be selected")
	private String places;
	@NotBlank(message="gifts should be selected")
	private String gifts;
}
