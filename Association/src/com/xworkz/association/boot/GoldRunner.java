package com.xworkz.association.boot;

import com.xworkz.association.things.Chain;
import com.xworkz.association.things.Gold;

public class GoldRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu....");
		Gold gold=new Gold();
		Chain chain=new Chain();
		gold.ownerName="Ashoka";
		System.out.println(gold.chain);
		System.out.println(chain.getPrice());
		System.out.println(chain.getNet_Weight());
		System.out.println(chain.getType());
		System.out.println(chain.getTotal_Rate());
		System.out.println(chain.getShop());
		System.out.println(chain.getLocation());
		System.out.println(chain.getPhNo());
		System.out.println(chain.getGST());
		System.out.println(chain.getAlmark());
		System.out.println(chain.getPatterns());
		
		gold.display();
	}

}
