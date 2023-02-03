
class VowelsConso
{
	public static void main(String[] args)
	{
		String name="Welcome to X-Workz to learn Java Programs";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println("count the vowels : " +count);
	}
}


		
		