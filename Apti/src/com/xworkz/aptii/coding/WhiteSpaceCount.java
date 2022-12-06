package com.xworkz.aptii.coding;

public class WhiteSpaceCount
{
	static int i,count=0,res;
	static int spacecount(String s)
	{
		for(i=0,count=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ');
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		res=WhiteSpaceCount.spacecount("I am Chaithra");
		System.out.println("the number of spaces are :" + res);
	}

}
