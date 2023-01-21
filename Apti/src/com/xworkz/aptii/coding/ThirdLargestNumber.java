package com.xworkz.aptii.coding;

import java.lang.reflect.Array;

public class ThirdLargestNumber {

	public static void main(String[] args) 
	{
		int temp, size;
		int array[]= {10,20,30,45,60,85,90};
		size=array.length;
		for(int i=0 ; i<size ;i++)
		{
			for(int j=i+1 ;j<size ;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("third larggest number is :" +array[size-3]);
	}

}
