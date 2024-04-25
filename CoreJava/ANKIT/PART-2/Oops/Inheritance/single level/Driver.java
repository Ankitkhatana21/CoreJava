class Driver
{
	public static void main(String [] args)
	{
		B b = new B();
		b.c1();
		b.c2();
		System.out.println(b.r);
		System.out.println(b.e); 

		b.m1();
		b.m2();
		System.out.println(b.p);
		System.out.println(b.y);

		A a = new A();
		a.m1();
		a.m2();
		System.out.println(a.p);
		System.out.println(a.y);

		
	}
}