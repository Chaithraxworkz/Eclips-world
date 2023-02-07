package com.xworkz.chaithra.controller;

import java.util.List;

import javax.swing.border.BevelBorder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chaithra.dto.BeverageDTO;
import com.xworkz.chaithra.dto.ChatsDTO;
import com.xworkz.chaithra.dto.EducationDTO;
import com.xworkz.chaithra.dto.FamilyDTO;
import com.xworkz.chaithra.dto.MobileDTO;

import lombok.AllArgsConstructor;

@Component
@RequestMapping("/")
public class DisplayController 
{
	@GetMapping("/email")
	public String onEmail(Model model) 
	{
		System.out.println("running Email");
		model.addAttribute("email","chaithram@gmail.com");
		return "index.jsp";
	}
	@GetMapping("/mobNumber")
	public String OnNumber(Model model) 
	{
		System.out.println("running the OnNumber");
		model.addAttribute("mobNumber",8541207563l);
		return "index.jsp";
	}
	@GetMapping("/adhar")
	public String onAdhar(Model model) 
	{
		System.out.println("running the onAdhar");
		model.addAttribute("adhar",5737501206470l);
		return "index.jsp";
	}
	@GetMapping("/age")
	public String onAge(Model model) 
	{
		System.out.println("running The age");
		model.addAttribute("age",24);
		return "index.jsp";
	}
	@GetMapping("/dob")
	public String onDOB(Model model) 
	{
		System.out.println("running the dob");
		model.addAttribute("dob",LocalDateTime.of(2000,02,04, 4,15));
		return "index.jsp";
	}
	@GetMapping("/salary")
	public String onSalary(Model model) 
	{
		System.out.println("running the salary");
		model.addAttribute("salary",25000);
		return "index.jsp";
	}
	@GetMapping("/friends")
	public String onFriends(Model model) 
	{
		System.out.println("running the friends");
		List<String> frnds = new ArrayList<String>();
		frnds.add("Srusti");
		frnds.add("Pavan");
		frnds.add("Chaithra");
		frnds.add("Suma");
		model.addAttribute("name",frnds);
		return "index.jsp";
	}
	@GetMapping("/places")
	public String onPlaces(Model model) 
	{
		System.out.println("running the places");
		List<String> place = new ArrayList<String>();
		place.add("Mysore");
		place.add("Ooty");
		place.add("Madikeri");
		place.add("Madras");
		model.addAttribute("visit",place);
		return "index.jsp";
	}
	@GetMapping("/skills")
	private String onSkills(Model model) 
	{
		System.out.println("running the places");
		List<String> siklls = new ArrayList<String>();
		siklls.add("Java");
		siklls.add("HTML");
		siklls.add("CSS");
		siklls.add("SQL");
		siklls.add("LOMBOK");
		siklls.add("JSP");
		siklls.add("QUARKUS");
		siklls.add("JSIL");
		siklls.add("GITHUB");
		model.addAttribute("softSkills",siklls);
		return "index.jsp";
	}
	@GetMapping("/dto")
	public String onEducation(Model model) 
	{
		System.out.println("running the Education dto");            
		EducationDTO dtos = new EducationDTO();
		dtos.setCollegeName("Govt eng college");
		dtos.setFees(20000);
		dtos.setOpeningYear(LocalDate.of(1995, 06, 12));
		dtos.setCampus(false);
		dtos.setDistrict("chamarajnagar");
		dtos.setPhoneNo(6201420752L);
		dtos.setTaluk("chnagar");
		dtos.setPinCode(520146);
		dtos.setJoiningDate(LocalDate.now());
		dtos.setLocation("chamarajnagar");
		model.addAttribute("data",dtos);
		return "index.jsp";
	}
	@GetMapping("/family")
	private String onFamily(Model model) 
	{
		System.out.println("running the family");
		FamilyDTO fam = new FamilyDTO();
		fam.setFatherName("Manjunatha");
		fam.setMotherName("Nethravathi");
		fam.setSisterName("Spoorthy");
		fam.setLocation("Kodambhalli");
		fam.setTaluk("Channapatana");
		fam.setDistrict("Ramanagr");
		fam.setPinCode(562138);
		fam.setFatherOccupation("conductor");
		fam.setWorking(true);
		fam.setPhoneNo(954201357L);
		model.addAttribute("home",fam);
		return "index.jsp";
	}
	@GetMapping("/mobile")
	public String onMobile(Model model) 
	{
		System.out.println("running the mobile");
		MobileDTO phone = new MobileDTO();
		phone.setBrand("Vivo");
		phone.setColor("Grey");
		phone.setPrice(25000);
		phone.setRam("62GB");
		phone.setDualCamera(true);
		model.addAttribute("mobile",phone);
		return "index.jsp";
	}
	@GetMapping("/beverage")
	private String onBeverage(Model model) 
	{
		System.out.println("running the Beverage");
		BeverageDTO beverage = new BeverageDTO();
		beverage.setName("mazza");
		beverage.setBrand("Nandani");
		beverage.setPrice(150);
		beverage.setCash(true);
		beverage.setLocation("Channapatana");
		beverage.setOwnerName("Rangappa");
		beverage.setQuantity(10);
		model.addAttribute("Beverage",beverage);
		return "index.jsp";
	}
	@GetMapping("/chat")
	public String onChats(Model model) 
	{
		System.out.println("running the chat DTO");
		ChatsDTO chat = new ChatsDTO();
		chat.setChatName("French Fries");
		chat.setPrice(100);
		chat.setLocation("rajajinagar");
		chat.setNoOfChats(150);
		chat.setNoOfPeoples(300);
		chat.setOpeningTime(LocalTime.of(04,00));
		chat.setPhNo(9542013657l);
		chat.setSalty("yes");
		chat.setSpicy(false);
		chat.setStarted(LocalDate.now());
		model.addAttribute("chats",chat);
		return "index.jsp";
	}
	
}

