class PrimeDemo
{
   public static void main(String args[])
{
    int no = Integer.parseInt(args[0]);
for(int i=1;i<=no;i++)
  {
	int count = 0;
	for(int j=1;j<=i;j++)
	{
		if(i % j == 0)
			count++;
	}
   if (count == 2)
	   System.out.println (i+ "is prime number");
   else
	   System.out.println (i+ "is not prime number");
  }
 }
}