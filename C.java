/*public interface Bank
{
    void withdrawl();
	void balance();
	void deposit();

}*/




interface A1
{
	int x =10;
}

interface B1
{
	int x =10;
}

class C1 implements A1,B1
{
	public static void main(String args[])
	{
		System.out.println(A.x +" "+ B.x);
	}
	
	
	
}

