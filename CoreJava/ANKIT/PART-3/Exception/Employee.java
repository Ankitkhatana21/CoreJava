class Employee
{
	private String name;
	private String pwd;
	private double balance;
	

	Student(String name, String pwd,double balance)
	{
		this.name= name;
		this.pwd=pwd;
	}

	public void getName(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println(Name);
		}
		else 
		{
			//System.out.println("invalid pwd");
			try
			{
				throw mew Insufficientbalance();
			}
			catch(Insufficientbalance a)
			{
				System.out.println(a.getMessage());
			}
		}
	}
	
	public static void main(String [] args)
	{

		Employee e= new Employee("Dev","123",4512.02);
		e.getName(123);
		e.getName(1234);
		e.getbalance(123);

	}