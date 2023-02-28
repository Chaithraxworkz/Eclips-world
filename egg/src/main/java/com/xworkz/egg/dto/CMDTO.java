package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class CMDTO 
{
	@NotNull(message = "Cm Name cannot be null or blank")
	@Size(min=3,max=20,message="CM Name should be more than 3 and less than 20")
	private String name;
	@NotBlank(message="party cannot be Null")
	private String party;
	@NotBlank(message="state cannot be Null")
	private String state;
	//@NotBlank(message="Tenure cannot be Null")
	@Min(value=1,message="Tenure cannot be less than zero")
	private Integer tenure;
	@NotBlank(message="Portfolio cannot be Null")
	private String portfolio;
}
