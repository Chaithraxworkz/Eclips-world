package com.xworkz.technical;

public class Square 

{
	public static void main(String[] args) 
	{
		for(int i=0;i<=2;i++) 
		{
		  for(int j=0;j<=2;j++) 
		  {
			  if(i==j)
			  System.out.print(" 1 2 3 ");
			  
		  }
		  System.out.println(" ");
		}
		System.out.println("===========================");
		for(int i=0 ; i<=2 ;i++)
		{
			for(int j=0 ; j<=2 ; j++)
			{
				if(i==j)
				{
					System.out.print("1 2 3 Chaithra");
				}
				System.out.println(" ");
			}
		}
		System.out.println("========================================");
		for(int i=1 ; i<=3 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		System.out.println("===========================");
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ;j>=4 ; j++)
			{
				System.out.println(" # ");
			}
			System.out.println(" ");
		}
		for(int i=1; i<=3 ; i++)
		{
			for(int j=i ; j<=3 ; j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}	
