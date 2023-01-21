package com.xworkz.aptii.coding;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in); //take input o the user
		int start=scr.nextInt(); //aaccept the integer
		int end=scr.nextInt();
		//System.out.println(start);
		//System.out.println(end);
		for(int i=start ; i<=end ; i++)
		{
			//System.out.println(i);
			int num=i;
			int temp =num;
			//System.out.println(" " +temp);
			int count=0;
			for(;temp!=0;temp=temp/10)//getting syntax error
				//
			{
				count++;
			}
			int n=temp;
			int ref=0;
			int sum=0;
			for(;n>0;n=n/10)
			{
				ref=n%10;
				sum +=(int)Math.pow(ref, count);
				count--;
			}
			if(num == sum)
			{
				System.out.println(num + " ");
			}
		}
		
	}

}
