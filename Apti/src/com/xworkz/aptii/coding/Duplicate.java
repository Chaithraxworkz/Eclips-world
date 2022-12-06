package com.xworkz.aptii.coding;

import java.util.Arrays;

public class Duplicate
{
	static void Duplicate(char Str[],int length)
	
	{
		int index=0;
		for(int i=0;i<length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(Str[i] == Str[j])
				{
					break;
				}
			}
			if(j==i)
			{
				Str[index++]=Str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(Str, index)));
	}
	public static void main(String[] args) 
	{
		String info="Welcome to java";
		char Str[]=info.toCharArray();
		int len=Str.length;
		Duplicate(Str, len);
	}
}
