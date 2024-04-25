// wajp to Access non Static variable  using object

class AA
{
	int r=54;
	public void m1()
	{
	System.out.println("HY");
	}
	public static void main(String [] args)
	{
	AA a=new AA();
	a.m1();
	System.out.println(a.r);
	}
}

