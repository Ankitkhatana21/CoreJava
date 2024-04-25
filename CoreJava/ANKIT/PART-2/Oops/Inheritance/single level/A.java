class A
{
	static int y =9;
	int p=8;
	public static void m1()
	{
		System.out.println("static m1 from parent");
	}
	
	public void m2()
	{
		System.out.println("non static m2 from parent");
	}

	static
	{
		System.out.println("static multiline intializer parent class");
	}
	
	{
		System.out.println("non static multiline intializer parent class");
	}

		
}	
