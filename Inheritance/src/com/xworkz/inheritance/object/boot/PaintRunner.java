package com.xworkz.inheritance.object.boot;

import com.xworkz.inheritance.component.God;
import com.xworkz.inheritance.object.Currency;
import com.xworkz.inheritance.object.Hospital;
import com.xworkz.inheritance.object.Institution;
import com.xworkz.inheritance.object.Lipstick;
import com.xworkz.inheritance.object.Paint;
import com.xworkz.inheritance.object.Vehicle;
import com.xworkz.inheritance.object.WaterBottle;

public class PaintRunner {

	public static void main(String[] args)
	{
		Paint paint=new Paint();
		paint.setBrand("Asian");
		paint.setColor("Red");
		paint.setLocation("Bangalore");
		paint.setPrice(360);
		paint.setType("Oil Paint");
		paint.setProducts("Chemical");
		paint.setName("aaa");
		paint.setQuantity(1.5);
		paint.setQuality(false);
		System.out.println(paint);
		
		
		Paint paint2=new Paint("Asian", "aaa", 500, 1.0, "Red", "Enamal paint", "chemical", "Cpt", true);
		System.out.println(paint2);
		paint=paint2;
		boolean same=paint.equals(paint2);
		System.out.println(same);
		
		System.out.println("==========================================");
		Vehicle vehicle=new Vehicle("Ford", "maruti suzuki", 2.00000, "Silver", 10.6, false, 1886, "India", " Carl Benz",2.95);
		System.out.println(vehicle);
		
		Vehicle vehicle2=new Vehicle("BMW", "TVS", 15.0000, "Blue", 8.5, true, 1999, "China", "John", 30.52);
		System.out.println(vehicle2);
		boolean ref=vehicle.equals(vehicle2);
		System.out.println(ref);
		
		System.out.println("'==========================================================");
		Institution institute=new Institution("Jspader", "Hebbal", 49000, 78554411066L, "Shankar", 15-8-2022, 562870, "Vandana", 150, false);
		System.out.println(institute);
		
		Institution institute2=new Institution("Jspader", "Hebbal", 49000, 78554411066L, "Shankar", 15-8-2022, 562870, "Vandana", 150, false);
		System.out.println(institute2);
		boolean same2=institute.equals(institute2);
		System.out.println(same2);
		
		System.out.println("========================================");
		WaterBottle water=new WaterBottle("Cello", "Nestlay", 300, "Silver", "1.5ltr", "Stainless Steel", "round", 4.2, true, 20-8-2019);
		System.out.println(water);
		WaterBottle water2=new WaterBottle("Cello", "Nestlay", 300, "Silver", "1.5ltr", "Stainless Steel", "round", 4.2, true, 20-8-2019);
		System.out.println(water2);
		water=water2;
		boolean show=water.equals(water2);
		System.out.println(show);
		
		System.out.println("=================================");
		Lipstick lipstick=new Lipstick("Lackme", "lipstick", 250, 4.5, "Pink", "Liquid", 4, 4-06-2023, "500gm", true);
		System.out.println(lipstick);
		
		Lipstick lipstick2=new Lipstick("Loreal", "Eyeliner", 150, 5.5, "Black", "Pencil", 5, 31-12-2019, "100gm", false);
		System.out.println(lipstick2);
		
		lipstick=lipstick2;
		boolean kajal=lipstick.equals(lipstick2);
		System.out.println(kajal);
		
		System.out.println("===============================================");
		Hospital obj=new Hospital("Jaydeva", "Bangalore", 988755441203L, false, "Ashitha", "Surjan", 1500, "Anil", 35, "Heartattack", 50);
		System.out.println(obj);
		
		Hospital obj2=new Hospital("Raja Rajeshwari", "Kengeri", 75566982015L, true, "Ranganath", "MD", 40000, "Kumari", 40, "Accident", 30);
		System.out.println(obj2);
		
		boolean shape=obj.equals(obj2);
		System.out.println(shape);
		
		System.out.println("========================================");
		God god=new God("Lakshmi", "F", "coin", "Kadga", "give money", 5.6);
		System.out.println(god);
		
		God god2=new God("Lakshmi", "F", "coin", "Kadga", "give money", 5.6);
		System.out.println(god2);
		
		god=god2;
		boolean swag=god.equals(god2);
		System.out.println(swag);

		System.out.println("=================================");
		Currency currency=new Currency("INR", "Rupee", "RBI", "Reserve Bank", "circular", 2019, "Green", "National Emblem", 02009, "Limited");
		System.out.println(currency);
		
		Currency currency2=new Currency("INR", "Rupee", "RBI", "Reserve Bank", "circular", 2019, "Green", "National Emblem", 02009, "Limited");
		System.out.println(currency2);
		
		currency=currency2;
		boolean act=currency.equals(currency2);
		System.out.println(act);
	}

}
