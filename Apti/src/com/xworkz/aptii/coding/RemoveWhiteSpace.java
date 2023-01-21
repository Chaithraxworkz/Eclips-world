package com.xworkz.aptii.coding;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String str="Welcome to java program";
		String s="";
		
		int count=0;
		for(char ch:str.toCharArray())
		{
			if(ch==' ')
			{
				count+=1;//count=count+1;
			}
			else
			{
				s+=ch;//s=s+ch;
			}
			
		}
		System.out.println("count the white space:" +count);
		System.out.println("String without the space:"+s);
		
	}

}
