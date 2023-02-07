package com.xworkz.chaithra.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class EducationDTO 
{
	private String collegeName;
	private double fees;
	private String location;
	private boolean campus;
	private long phoneNo;
	private LocalDate joiningDate;
	private String district;
	private int pinCode;
	private String taluk;
	private LocalDate openingYear;
	
}
