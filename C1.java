public interface Bank
{
    int x = 10;   //in interface we declare any variable it maks as final static by default  
	
	void withdrawl();
	void balance();    //in interface every method should be abstract method
	void deposit();

}




 /*interface A1
{
	int x =10;
}

 interface B1        //multiple inheritance is possible through interfaces 
{
	int x =10;
}

class C1 implements A1,B1    //using implements keyword we invoked two interfaces
{
	public static void main(String args[])
	{
		System.out.println(A1.x +" "+ B1.x);    // using class name we can call the variable directly
	}
	
	
	
}*/

