class CurrencyConversion
{
	/**
	* i.e "Too few parameters <br> 1.USD to INR <br> 2.INR to USD <br> i.e. CurrencyConversion "Currency type" "Currency Value"
	**/
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Too few parameters\n");
			System.out.println("1.USD to INR\n2.INR to USD");
			System.out.println("i.e. CurrencyConversion <Currency type> <Currency Value>");
			System.exit(0);
		}
		int currencyType=Integer.parseInt(args[0]);
		double currencyValue=Double.parseDouble(args[1]);
		double rate=70;
		if(currencyType==1)
		{
			System.out.println("$"+currencyValue+"="+currencyValue*70+"Rs");
		}
		else
		{
			System.out.println(currencyValue+"Rs=$"+currencyValue/70);
		}
	}
}