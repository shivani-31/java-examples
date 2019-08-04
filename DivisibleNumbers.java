class DivisibleNumbers
{
	/**
	* i.e "Too few parameters <br> i.e. DivisibleNumbers "Value for performing divisible operation" "Range for Divisibility"("n1" "n2")"
	**/
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Too few parameters");
			System.out.println("i.e. DivisibleNumbers <Value for performing divisible operation> <Range for Divisibility>(<n1> <n2>)");
			System.exit(0);
		}
		int value=Integer.parseInt(args[0]);
		int firstNumber=Integer.parseInt(args[1]);
		int secondNumber=Integer.parseInt(args[2]);
		int i;
		System.out.println("List of numbers divisible by "+value+" between range "+firstNumber+" and "+secondNumber);
		for(i=firstNumber;i<=secondNumber;i++)
		{
			if(i%value==0)
				System.out.println(i);
		}
	}
}