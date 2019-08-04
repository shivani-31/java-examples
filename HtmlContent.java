class HtmlContent
{
	/**
	*To extract content from HTML string.
	*/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Error:Too few parameters");
			System.out.println("Please enter HTML string");
			System.exit(0);
		}
		String HTML_str=args[0];
		int l=HTML_str.length();
		char[] HTML_str_part=HTML_str.toCharArray();
		int i,code;
		for(i=0;i<HTML_str_part.length;i++)
		{
			code=HTML_str_part[i];
			if(code==60)
			{
				do
				{
					i++;
					code=HTML_str_part[i];
				}while(code!=62 && i<HTML_str_part.length);
			}
			else
				System.out.print(HTML_str_part[i]);
		}
				
	}
}