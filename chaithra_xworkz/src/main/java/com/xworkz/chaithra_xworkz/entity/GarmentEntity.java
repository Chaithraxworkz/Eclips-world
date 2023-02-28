package com.xworkz.chaithra_xworkz.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "garment_table")
public class GarmentEntity 
{
	@Id
	@Column(name="g_id")
	private int id;
	@Column(name="g_name")
	private String name;
	@Column(name="g_location")
	private String location;
	@Column(name="g_phNo")
	private int phNo;
	@Column(name="g_ownerName")
	private String ownerName;
	@Column(name="g_noOfEmployees")
	private int noOfEmployees;
}
