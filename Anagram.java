class Anagram
{
	/**
	*To check strings are Anagram or not.
	*/
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Error:Too few parameters");
			System.out.println("Please enter two strings");
			System.exit(0);
		}
		StringBuffer str1=new StringBuffer(args[0]);
		StringBuffer str2=new StringBuffer(args[1]);
		int l1=str1.length();
		int l2=str2.length();
		if(l1!=l2)
		{
			System.out.println("Given Strings is not Anagram");
			System.exit(0);
		}
		
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;)
			{
				char str1c=str1.charAt(i);
				char str2c=str2.charAt(j);
				if(str1c==str2c)
				{	
					str2.deleteCharAt(j);
					str1.deleteCharAt(i);
					l2=l2-1;
					l1=l1-1;
					i=0;
					j=0;
				}
				else
					j++;
			}
		}
if(l2==0 && l1==0)
	System.out.println("Given Strings is Anagram");
else
	System.out.println("Given Strings is not Anagram");
	}
}