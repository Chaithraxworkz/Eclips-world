package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Naming;
import com.xworkz.inheritance.component.Type;
import com.xworkz.inheritance.thing.Invitation;

public class InvitationRunner {

	public static void main(String[] args)
	{
		Invitation card=new Naming("Druthi",Type.NAMING, 25, 3.5);
		System.out.println(card.name);
		System.out.println(card.type);
		System.out.println(card.price);
		System.out.println(card.height);
	}

}
