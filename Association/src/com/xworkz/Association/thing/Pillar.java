package com.xworkz.Association.thing;
import com.xworkz.Association.thing.*;
public class Pillar 
{
	public long id;
	public String place;
	public Shapes shape;
	public double height;
	public String supporting;
	public Company office=new Company("Pillar Industries India Private Limited", "Iron pillar");
	
	public Pillar(long id, String place, Shapes shape, double height, String supporting)
	{
		super();
		this.id = id;
		this.place = place;
		this.shape = shape;	
		this.height = height;
		this.supporting = supporting;
		
	}
	
	public void  showOff()
	{
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.shape);
		System.out.println(this.height);
		System.out.println(this.supporting);
		
	}
	
}
