class NumberConversion
{

	/**
	* i.e "Too few parameters <br> 1.Decimal to Binary <br> 2.Binary to Decimal <br> i.e. NumberConversion "Conversion type" "Value"
	**/
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Too few parameters");
			System.out.println("1.Decimal to Binary\n2.Binary to Decimal ");
			System.out.println("i.e. NumberConversion <Conversion Type> <Value>");
			System.exit(0);
		}
		int conversionType=Integer.parseInt(args[0]);
		int value=Integer.parseInt(args[1]);
		double decimal,temp=0,j=0;
		int binary[]=new int[8];
		int i;
		if(conversionType==1)
		{
			for(i=0;value>0;i++)
			{
				
				binary[i]=value%2;
				value=value/2;
				
			}
			System.out.println("Equivalent Binary Value: ");
			for(i=i-1;i>=0;i--)
			{
				System.out.print(binary[i]);
			}
		}
		else
		{
			for(i=0;value!=0;i++)
			{
				decimal=value%10;
				if(decimal==0 || decimal==1)
					temp=temp+decimal*Math.pow(2,i);
				else
				{
					System.out.println("Error");
					System.exit(0);
				}
				value=value/10;
			}
			System.out.println("Equivalent Decimal Value: "+temp);	
		}
	}
}