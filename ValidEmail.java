class ValidEmail
{
	/**
	*To check given Email address is valid or not.
	*i.e ValidEmail "Email_Address".
	*/
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("Error:Too few parameters\ni.e ValidEmail <E-mail address>");
			System.exit(0);
		}
		String email=args[0];
		boolean valid=false;
		int firstCharUnicode=email.codePointAt(0);
		if((firstCharUnicode<97 || firstCharUnicode>122) && (firstCharUnicode<48 || firstCharUnicode>57))
		{
			System.out.println("First character must be some valid character");
			System.exit(0);
		}
		String emailParts[]=email.split("@");
		int emailNameLength=emailParts[0].length();
		if(emailNameLength<8 || emailNameLength>20)
		{
			System.out.println("Email name must be 8 to 20 characters");
			System.exit(0);
		}
		for(int i=1;i<emailNameLength;i++)
		{
			int charUnicode=emailParts[0].codePointAt(i);
			if((charUnicode<97 || charUnicode>122) && (charUnicode<48 || charUnicode>57) && charUnicode!=95 && charUnicode!=46)
			{
				System.out.println("Only dot(.) and underscore( _ ) are valid symbol");
				System.exit(0);
			}
		}
		int atPositionAtTheRate=email.indexOf('@');
		if(atPositionAtTheRate==-1)
		{
			System.out.println("There must be atleast one @ symbol");
			System.exit(0);
		}
		int atPositionDot=emailParts[1].indexOf('.');
		if(atPositionDot==-1)
		{
			System.out.println("There must be atleast one . symbol");
			System.exit(0);
		}
		int atPositionDot2=atPositionDot+atPositionAtTheRate+1;
		int difference=atPositionDot2-(atPositionAtTheRate+1);
		if(difference<2)
		{
			System.out.println("Enter valid domain name");
			System.exit(0);
		}
		valid=true;
		if(valid)
			System.out.println("Valid E-mail address");
		else
			System.out.println("Invalid E-mail address");
	}
}