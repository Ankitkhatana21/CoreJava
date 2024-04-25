class Student
{
	private String name;
	private int roll;
	private long phno;

	Student(String name, int roll, long phno)
	{
		this.name = name;
		this.roll = roll;
		this.phno = phno;
	}
	
	public void getName(long phno)
	{
		if(this.phno==phno)
		  System.out.println(name);
		else
		  System.out.println("invalid phno");
	}

	
	public void setName(String name,long phno)
	{
		if(this.phno==phno)
		{
			this.name=name;
		}
		  
		else
		  System.out.println("invalid phno");
	}

	
	public void getRoll(long phno)
	{
		if(this.phno==phno)
		  {
		  System.out.println(roll);
		   }
		else
		  System.out.println("invalid phno");
	}

	public void setphno(long phno, long old_phno)
	{
		if(this.phno== old_phno)
		{
			this.phno=phno;
		}
		  
		else
		  System.out.println("invalid phno");
	}
}