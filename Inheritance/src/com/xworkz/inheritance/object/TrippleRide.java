package com.xworkz.inheritance.object;

public class TrippleRide
{
	public static void main(String[] args) 
	{
		String movie="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters. Other popular actors who were roped in for Triple Riding are Sharath Lohithaswa, Kuri Prathap, Aravind Bolar and Chitkala Biradar.";
		String[] splits=movie.split(" ");
		for(int i=0;i<splits.length;i++ )
		{
			System.out.println(splits[i]);
		}
		System.out.println("to find no of R in a sentence");
		String word="R";
		String repeate[]=movie.split(" ");
		int count=0;
		for(int i=0;i<repeate.length;i++)
		{
			if(word.equals(repeate[i]))
			count++;
		}
		System.out.println("Rangayana Raghu as lead characters");
		
		System.out.println("=============================================");
		
		String[] split=movie.split(",");
		for (int i = 0; i < split.length; i++) 
		{
			System.out.println("split movie by, "+split[i]);
		}
		
		System.out.println("================================================");
		char[] charecter=movie.toCharArray();
		for (int i = 0; i < charecter.length; i++) 
		{
			System.out.println(charecter[i]);
		}
		
		String reverse=new StringBuffer(movie).reverse().toString();
		System.out.println("reverse="+ reverse);
		System.out.println("===============================================");
		
		System.out.println(movie.toUpperCase());
		System.out.println(movie.toLowerCase());
		
		System.out.println("================================================");
		
		StringBuffer buffer=new StringBuffer(movie);
		buffer.reverse();
		String palindrom=buffer.toString();
		if(movie.equals(palindrom))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		
		System.out.println("===================================================");
		
		char[] duplicate=movie.toCharArray();
		int count1;
		for (int i = 0; i < duplicate.length; i++) 
		{
			count1=1;
			for (int j = 0; j < duplicate.length; j++) 
			{
				if(duplicate[i]==duplicate[j] && duplicate[i]!= ' ')
				{
					count++;
					duplicate[j]='0';
				}
				if(count>1 && duplicate[i]!='0')
					System.out.println("duplicates are =" + duplicate[j]);
			}
		}
		
	}
}
