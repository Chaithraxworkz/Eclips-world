package com.xworkz.javaspring.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost 
{
	@Value("Swaroop")
	private String name;
	@Value("36")
	private int age;
	private String gender;
	@Value("2023-08-05")
	private LocalDate dateOfDeath;
	@Value("4.5")
	private double nails;
	@Value("5.9")
	private double height;
	private double weight;
	@Value("Medium")
	private String color;
	@Value("3")
	private int siblings;
	@Value("Kolar")
	private String place;
	@Value("Kavya")
	private String wife;
	private boolean isThereParents;
	private long mobileNo;
	private int noOfFriends;
	private LocalDate birthDate;
	private boolean partner;
	@Value("Sahana")
	private String partnerName;
	private String deathType;
	private String mother;
	private String nameOfSister;
	
	public Ghost(@Qualifier("ghostGender") String gender,@Qualifier("ghostWeight") double weight,@Qualifier("ParentsOfGhost") boolean isThereParents,@Qualifier("phoneNo") long mobileNo,@Qualifier("friends") int noOfFriends,
			@Qualifier("dateOfBirth") LocalDate birthDate,@Qualifier("ghostPartner") boolean partner,@Qualifier("type") String deathType,@Qualifier("ghostMother") String mother,@Qualifier("sisterName") String nameOfSister) 
	{
		super();
		this.gender = gender;
		this.weight = weight;
		this.isThereParents = isThereParents;
		this.mobileNo = mobileNo;
		this.noOfFriends = noOfFriends;
		this.birthDate = birthDate;
		this.partner = partner;
		this.deathType = deathType;
		this.mother=mother;
		this.nameOfSister = nameOfSister;
	}

	@Override
	public String toString() 
	{
		return "Ghost [name=" + name + ", age=" + age + ", gender=" + gender + ", dateOfDeath=" + dateOfDeath
				+ ", nails=" + nails + ", height=" + height + ", weight=" + weight + ", color=" + color + ", siblings="
				+ siblings + ", place=" + place + ", wife=" + wife + ", isThereParents=" + isThereParents
				+ ", mobileNo=" + mobileNo + ", noOfFriends=" + noOfFriends + ", birthDate=" + birthDate + ", partner="
				+ partner + ", partnerName=" + partnerName + ", deathType=" + deathType + ", mother=" + mother
				+ ", nameOfSister=" + nameOfSister + "]";
	}
	
}
