package com.xworkz.association.things;

public class Hospital 
{
	public String name="Keerthi Hospital";
	public Patient rogi=new Patient("Pavan","22", 30000, 60.5, "Karehalli", 6.5, 97542204416L, "Dengue", false, "Karna", 200);
	
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(rogi.getName());
		System.out.println(rogi.getAge());
		System.out.println(rogi.getPrice());
		System.out.println(rogi.getWeight());
		System.out.println(rogi.getAddress());
		System.out.println(rogi.getHeight());
		System.out.println(rogi.getPhNo());
		System.out.println(rogi.getDeciease());
		System.out.println(rogi.getAppointment());
		System.out.println(rogi.getDoctorName());
		System.out.println(rogi.getDoctorFee());
	}
}
