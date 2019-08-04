class NumberSorting
{
	/**
	*To sort an array in descending order.
	*/
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please Enter elements");
			System.exit(0);
		}
		int nos[]=new int[args.length];
		int i,j,temp;
		for(i=0;i<nos.length;i++)
		{
			nos[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<nos.length;i++)
		{
			for(j=0;j<nos.length-i-1;j++)
			{
				if(nos[j]>nos[j+1])
				{
					temp=nos[j];
					nos[j]=nos[j+1];
					nos[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted order:");
		for(i=args.length-1;i>=0;i--)
		{
			System.out.print(nos[i]+"    ");
		}
	}
}