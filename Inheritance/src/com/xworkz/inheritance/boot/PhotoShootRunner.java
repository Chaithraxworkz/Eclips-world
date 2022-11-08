package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.WeddingPhotoShoot;
import com.xworkz.inheritance.thing.PhotoShoot;

public class PhotoShootRunner {

	public static void main(String[] args) 
	{
		PhotoShoot photo=new WeddingPhotoShoot("Wedding", "nandihills",50000);
		System.out.println(photo.type);
		System.out.println(photo.location);
		System.out.println(photo.price);
		
	}

}
