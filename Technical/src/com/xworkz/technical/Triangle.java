package com.xworkz.technical;

public class Triangle
{

	public static void main(String[] args) 
	{
		
		int n=4;
		//main loop
		for(int i=1 ; i<=n ; i++)
		//printing space
		{
			for(int j=n-1 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("$");
			}
			System.out.println(" ");
		}
		System.out.println("================================");
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("% ");
			}
			System.out.println(" ");
		}
		System.out.println("=========================");
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println(" ");
		}
		System.out.println("=======================");
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("==============================");
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(j);
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println(" ");
		}
		System.out.println("=======================");
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				if(j==2)
				{
					System.out.print("chai ");
				}
				else
				{
					System.out.print(j);
				}
			}
			for(int k=1;k<=i;k++)
			{
				if(k==2)
				{
					System.out.print("chai ");
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println(" ");
		}
		System.out.println("=====================================");
		for(int i=n;i>=1;i--)
		{
			if(i==n) 
			{
				System.out.print(" ");
			}
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==n)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println(" ");
		}
	}
}
