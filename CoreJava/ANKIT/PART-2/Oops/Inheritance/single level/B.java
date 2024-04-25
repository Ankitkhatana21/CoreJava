class B extends A
{
	static int r =4;
	int e=7;
	public static void c1()
	{
		System.out.println("static c1 from child");
	}
	
	public void c2()
	{
		System.out.println("non static c2 from child");
	}

	B()
	{
		System.out.println("no argument constructor of child");	
	}

	B(int c, boolean b)
	{
		int i=60;
		long l=9873373832l;
		System.out.println("parameterize constructor 1 of child");	
	}

	
	B(boolean b, char c)
	{
		String s="hello";
		double d=55.2;
		System.out.println("parameterize constructor 2 of child");	
	}
}	

	