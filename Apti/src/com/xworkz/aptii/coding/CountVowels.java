package com.xworkz.aptii.coding;

public class CountVowels 
{
	public static void main(String[] args) 
	{
		String name="Welcome to Eclips";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("total vowels="+count);
	}
}
