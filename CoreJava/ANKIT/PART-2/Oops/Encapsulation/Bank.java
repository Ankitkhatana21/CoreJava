class Bank
{
	private long Acc_no;
	private String Acc_hold_name;
	private double balance;
	private String pwd;

	Bank(long Acc_no, String Acc_hold_name, double balance, String pwd)
	{
		this.Acc_no =Acc_no;
		this.Acc_hold_name=Acc_hold_name;
		this.balance= balance;
		this.pwd=pwd;
	}
	
	public void getaccNum(String pwd)
	{
		if(this.pwd==pwd)
		{
		System.out.println(Acc_no);
		}
		else
		
		System.out.println("invalid pwd");
	}
	
	public void getName(String pwd)
	{
		if(this.pwd==pwd)
		{
		System.out.println(Acc_hold_name);
		}
		else
		
		System.out.println("invalid pwd");
	}

	public void setName(String pwd,String Acc_hold_name)
	{
		if(this.pwd==pwd)
		{
		this.Acc_hold_name=Acc_hold_name;
		}
		else
		
		System.out.println("invalid pwd");
	}

	public void getBalance(String pwd)
	{
		if(this.pwd==pwd)
		{
		 System.out.println(balance);
		}
		else
		
		System.out.println("invalid pwd");
	}

	
	public void setBalance(String pwd, double balance)
	{
		if(this.pwd==pwd)
		{
		this.balance=this.balance+balance;
		}
		else
		
		System.out.println("invalid pwd");
	}

	
	public void setPwd(String pwd, String old_pwd)
	{
		if(this.pwd== old_pwd)
		{
		 this.pwd=pwd;
		}
		else
		
		System.out.println("invalid pwd");
	}
}