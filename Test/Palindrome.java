class Palindrome 
{
	public static void main(String [] args)
	{
		String name="gadag";
		String reverse="";
		for(int i=name.length()-1 ; i>=0 ; i--)
		{
			reverse =reverse + name.charAt(i);
		}
		if(reverse.equals(name))
		{
			System.out.println(name + " is a palindrome ");
		}
		else
		{
			System.out.println(name + " is  not a palindrome ");
		}
	}
}