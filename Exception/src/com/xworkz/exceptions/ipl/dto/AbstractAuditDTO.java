package com.xworkz.exceptions.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable
{
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	public AbstractAuditDTO()
	{
		System.out.println("calling the non argument constructor");
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy) 
	{
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() 
	{
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate)
	{
		this.createdDate = createdDate;
	}
	
}
