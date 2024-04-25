class Student
{
	private String name;
	private int roll;

	Student(String name, int roll)
	{
		this.name= name;
		this.roll=roll;
	}

	public void getName(int roll)
	{
		if(this.roll == roll)
		{
			System.out.println(name);
		}
		else 
		{
			//System.out.println("invalid pwd");
			try
			{
				throw mew InvalidPwd();
			}
			catch(InvalidPwd e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String [] args)
	{

		Student s= new Student("Dev",123);
		s.getName(123);
		s.getName(1234);

	}