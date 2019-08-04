class ValidEnroll
{
	/**
	*To check given GTU Enrollment Number is valid or not.
	*i.e ValidEnroll <Enrollment Number>.
	*/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Too few parameters\nValidEnroll <Enrollment number>");
			System.exit(0);
		}
		String enrollNo=args[0];
		boolean valid=false;
		int enrollLength=enrollNo.length();
		if(enrollLength==12)
		{
			int enrollYear=Integer.parseInt(enrollNo.substring(0,2));
			if(enrollYear>=19 || enrollYear<=15)
			{
				System.out.println("Invalid Year");
				System.exit(0);
			}
			int collegeCode=Integer.parseInt(enrollNo.substring(3,5));
			if(collegeCode!=47)
			{
				System.out.println("Invalid College Code");
				System.exit(0);
			}
			int studentType=Integer.parseInt(enrollNo.substring(5,7));
			if(studentType!=01 && studentType!=31)
			{
				System.out.println("Invalid Student Type");
				System.exit(0);
			}
			int branchCode=Integer.parseInt(enrollNo.substring(8,9));
			if(branchCode!=7)
			{
				System.out.println("Invalid Branch Code");
				System.exit(0);
			}
			valid=true;
		}
		if(valid)
			System.out.println("Valid Enrollment Number");
		else
			System.out.println("Invalid Enrollment Number");
	}
}
		