class BasicCalc
{
	/**
	*BasicCalc Number 
	*1 Number <br> 2 Operation to be performed on two numbers
	* 1.Addition  2.Subtraction  3.Multiplication s 4.Division
	*/
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Error:Too Few Parameters");
			System.out.println("BasicCalc <Number 1> <Number 2> <Operation to be performed on two numbers>" );
			System.out.println("i.e. 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			System.exit(0);
		}
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int operation=Integer.parseInt(args[2]);
		switch(operation)
		{
			case 1:System.out.println("Addition: "+num1+" + "+num2+" = "+(num1+num2));
			          break;
			case 2:System.out.println("Subtraction: "+num1+" - "+num2+" = "+(num1-num2));
			          break;
			case 3:System.out.println("Multiplication: "+num1+" * "+num2+" = "+(num1*num2));
			          break;
			case 4:System.out.println("Division: "+num1+" / "+num2+" = "+(num1/num2));
			          break;
			default:System.out.println("Invalid parameter");
			          break;
	
		}
	}
}


		
			