

class ReverseString
{
	public static void main(String[] args)
	{
		String name="WORD";
		System.out.println(name.length());
		String rev=new String("WORD");
		System.out.println(rev);
		for(int  i=name.length()-1 ; i>=0 ; i--)
		{
			System.out.print(name.charAt(i));
		}
	}
}