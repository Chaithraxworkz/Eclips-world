package com.xworkz.association.things;

public class Gold
{
	public String ownerName="Asoka";
	public Chain chain=new Chain();
	
	public void display()
	{
		System.out.println(this.ownerName);
		
		System.out.println(chain.getPrice());
		chain.setprice(14000);
		
		System.out.println(chain.getNet_Weight());
		chain.setNet_Weight(6.9);
		
		System.out.println(chain.getType());
		chain.setType("Gold");
		
		System.out.println(chain.getTotal_Rate());
		chain.setTotal_Rate(15100);
		
		System.out.println(chain.getShop());
		chain.setShop("shop");
		
		System.out.println(chain.getLocation());
		chain.setLocation("Mumbai");
		
		System.out.println(chain.getPhNo());
		chain.setPhNo(97450632108L);
		
		System.out.println(chain.getGST());
		chain.setGST(5);
		
		System.out.println(chain.getAlmark());
		chain.setAlmark(true);
		
		System.out.println(chain.getPatterns());
		chain.setPatterns("Simple");
		
		
		
	}
}
