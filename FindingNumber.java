class FindingNumber
{
	public static void main (String args[])
	{
		int no =30;
		//int n = Integer.parseInt(args [0]);
		int number [] = {1,2,3,4,5,6,7,8};
		boolean flag = false;
		
		for(int i =0;i<number.length;i++)
		{
			if(no == number[i])
				flag =true;
		}
		if(flag)
		
				System.out.println( no + " is present");
			else
				System.out.println( no + " is not present");
	
	}
}