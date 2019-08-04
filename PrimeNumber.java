class PrimeNumber
{
		/**
		* i.e "Error:Too Few Parameters <br> Argument must contain the number i.e how many prime numbers you want to print <br> i.e PrimeNumber "value""
		**/
 	public static void main(String args[])
 	{
 		 if(args.length!=1)
		 {
			System.out.println("Error:Too Few Parameters");
			System.out.println("Argument must contain the number i.e how many prime numbers you want to print\ni.e PrimeNumber <value>");
			System.exit(0);
		 }
		 int n=Integer.parseInt(args[0]);
		 int  i=1,p=2,count,flag;
     		 System.out.println("First "+n+" prime numbers are :-"); 
     		 while(i<=n)
     		 {
         			flag=1;
         			for(count=2;count<=p-1;count++)
         			{
             			if(p%count==0)  
             			{
              				flag=0;
              				break;  
             			} 
         			}
             		if(flag==1)
           			{
               			System.out.print(p+" ") ;
              			 i++;
             		}
         			p++;
     		 }
 	}
}