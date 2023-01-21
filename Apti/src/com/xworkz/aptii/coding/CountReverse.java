package com.xworkz.aptii.coding;

import java.util.Scanner;

public class CountReverse {

	public static void main(String[] args) 
	{
		String str="Welcome to java ";
		String s[]=str.split(" ");
		Scanner sp=new Scanner(System.in);
		String rev=sp.next();
		String name="";
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(rev))
			{
				char ch[]=rev.toCharArray();
				for(int j=ch.length-1;j>=0;j--) 
				{
					name=name+ch[j];
				}
			}
		}
		for()
	}

}
