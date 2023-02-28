package com.xworkz.tent.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="toothpaste_table")
public class ToothPasteDTO 
{
	@Column(name="TP_id")
	@Id
	private int id;
	@Column(name="TP_brand")
	private String brand;
	@Column(name="TP_price")
	private double price;
	@Column(name="TP_color")
	private String color;
	@Column(name="TP_salt")
	private boolean salt;
	
	public ToothPasteDTO()
	{System.out.println("created" + this.getClass().getSimpleName());
	}
}
