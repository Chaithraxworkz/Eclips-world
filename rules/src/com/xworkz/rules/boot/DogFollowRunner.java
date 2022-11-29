package com.xworkz.rules.boot;

import com.xworkz.rules.Dog;
import com.xworkz.rules.bridge.DogFollowRules;

public class DogFollowRunner {

	public static void main(String[] args) 
	{
		Dog dog=new DogFollowRules();
		dog.nameOfDog();
		dog.colorOfDog();
		dog.priceOfDog();
		dog.rulesOfDog();
		dog.weightOfDog();
	}

}
