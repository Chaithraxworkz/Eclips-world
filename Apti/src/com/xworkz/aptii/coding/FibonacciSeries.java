package com.xworkz.aptii.coding;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int ano = 0;
		int bno = 1;
		System.out.println(ano);
		System.out.println(bno);
		int result=ano + bno;
		while(result<100)
		{
			System.out.println(result);
			ano = bno;
			bno = result;
			result =ano + bno;
		}
	}
}
