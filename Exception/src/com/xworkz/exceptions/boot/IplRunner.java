package com.xworkz.exceptions.boot;

import java.time.LocalDateTime;

import com.xworkz.exceptions.ipl.dto.IplDTO;
import com.xworkz.exceptions.ipl.repository.IplRepository;
import com.xworkz.exceptions.ipl.repository.IplRepositoryImplementation;

public class IplRunner {

	public static void main(String[] args) 
	{
		IplRepository repo=new IplRepositoryImplementation();
		
		IplDTO dto=new IplDTO();
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat");
		dto.setOwnerAlive(true);
		dto.setPurse(95);
		dto.setWins(121);
		dto.setDefeats(113);
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());
		
		System.out.println("===================================================================");
		IplDTO dto2=new IplDTO();
		dto2.setTeamName("CSK");
		dto2.setCaptainName("Dhoni");
		dto2.setOwnerAlive(true);
		dto2.setPurse(70);
		dto2.setWins(100);
		dto2.setDefeats(120);
		dto2.setCreatedBy("SYSTEM");
		dto2.setCreatedDate(LocalDateTime.of(2017, 11, 11, 4, 10));
		
		System.out.println("===================================================================");
		IplDTO dto3=new IplDTO();
		dto3.setTeamName("RAJASTAN ROYALS");
		dto3.setCaptainName("Sanju Samson");
		dto3.setOwnerAlive(true);
		dto3.setPurse(13.2);
		dto3.setWins(94);
		dto3.setDefeats(100);
		dto3.setCreatedBy("SYSTEM");
		dto3.setCreatedDate(LocalDateTime.of(2016, 8, 9, 5, 18));
		
		System.out.println("===================================================================");
		IplDTO dto4=new IplDTO();
		dto4.setTeamName("KKR");
		dto4.setCaptainName("Shreyas Iyer");
		dto4.setOwnerAlive(false);
		dto4.setPurse(7.05);
		dto4.setWins(113);
		dto4.setDefeats(140);
		dto4.setCreatedBy("SYSTEM");
		dto4.setCreatedDate(LocalDateTime.of(2018, 05, 04, 2, 12));
		
		System.out.println("===================================================================");
		IplDTO dto5=new IplDTO();
		dto5.setTeamName("DELHI CAPITALS");
		dto5.setCaptainName("Rishabh Pant");
		dto5.setOwnerAlive(true);
		dto5.setPurse(19.45);
		dto5.setWins(100);
		dto5.setDefeats(80);
		dto5.setCreatedBy("SYSTEM");
		dto5.setCreatedDate(LocalDateTime.of(2020, 02, 24, 6, 25));
		
		System.out.println("===================================================================");
		IplDTO dto6=new IplDTO();
		dto6.setTeamName("PUNJAB KINGS");
		dto6.setCaptainName("Mayank Agarwal");
		dto6.setOwnerAlive(true);
		dto6.setPurse(32.2);
		dto6.setWins(98);
		dto6.setDefeats(50);
		dto6.setCreatedBy("SYSTEM");
		dto6.setCreatedDate(LocalDateTime.now());
		
		System.out.println("===================================================================");
		IplDTO dto7=new IplDTO();
		dto7.setTeamName("LSG");
		dto7.setCaptainName("KL Rahul");
		dto7.setOwnerAlive(false);
		dto7.setPurse(23.35);
		dto7.setWins(9);
		dto7.setDefeats(100);
		dto7.setCreatedBy("SYSTEM");
		dto7.setCreatedDate(LocalDateTime.now());
		
		System.out.println("===================================================================");
		IplDTO dto8=new IplDTO();
		dto8.setTeamName("SH");
		dto8.setCaptainName("Kane Williamson");
		dto8.setOwnerAlive(true);
		dto8.setPurse(42.25);
		dto8.setWins(74);
		dto8.setDefeats(60);
		dto8.setCreatedBy("SYSTEM");
		dto8.setCreatedDate(LocalDateTime.of(2021,07,25, 12, 50));
		
		System.out.println("===================================================================");
		IplDTO dto9=new IplDTO();
		dto9.setTeamName("GT");
		dto9.setCaptainName("Hardik Pandya");
		dto9.setOwnerAlive(true);
		dto9.setPurse(70.5);
		dto9.setWins(12);
		dto9.setDefeats(40);
		dto9.setCreatedBy("SYSTEM");
		dto9.setCreatedDate(LocalDateTime.of(2013, 03, 20, 11, 48));
		
		System.out.println("===================================================================");
		IplDTO dto10=new IplDTO();
		dto10.setTeamName("Mumbi Indians");
		dto10.setCaptainName("Rohit Sharma");
		dto10.setOwnerAlive(false);
		dto10.setPurse(20.55);
		dto10.setWins(129);
		dto10.setDefeats(90);
		dto10.setCreatedBy("SYSTEM");
		dto10.setCreatedDate(LocalDateTime.of(2022, 06, 20, 8, 35));
		
		repo.create(dto);
	}

}
