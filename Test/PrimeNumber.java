4) Write a program to check the given number is prime or not?
class PrimeNumber
{
	public static void main(String[] args)
	{
		int num=4;
		boolean isprime =true;
		for(int i=2 ; i<num ; i++)
		{
			if(num % i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println(num +"is prime number");
		}
		else
		{
			System.out.println(num+"is not a prime number");
		}
	}
}