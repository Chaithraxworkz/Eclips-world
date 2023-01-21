package com.xworkz;

public class Reverse {

	public static void main(String[] args) {
		String str = " Welcome to java ";
String[] ch=str.split(" ");
		String rev = " ";
		for (int i =ch.length - 1 ; i >= 0; i--) {
			rev = rev +" "+ch[i] ;

		}

		System.out.println(rev);

	}

}
