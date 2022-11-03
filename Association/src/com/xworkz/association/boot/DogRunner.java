package com.xworkz.association.boot;

import com.xworkz.association.things.Dog;
import com.xworkz.association.things.Pet;

public class DogRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu....");
		Dog dog=new Dog();
		Pet pet=new Pet();
		
		System.out.println(dog.d_Name);
		System.out.println(dog.pet);
		System.out.println(pet.getName());
		System.out.println(pet.getColor());
		System.out.println(pet.getAge());
		System.out.println(pet.getFood());
		System.out.println(pet.getWeight());
		System.out.println(pet.getHeight());
		System.out.println(pet.getOwnerName());
		System.out.println(pet.getAddress());
		System.out.println(pet.getPhNo());
		System.out.println(pet.getWalking());
	}

}
