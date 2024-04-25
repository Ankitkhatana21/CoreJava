class Employee
{
	private String ename;
	private int eid;
	private String edept;
	private long phno;

	Employee(String ename, int eid, String echar, long phno)
	{
		this.ename = ename;
		this.eid = eid;
		this.edept = edept;
		this.phno = phno;
	}

	public void getName(int eid)
	{
		if(this.eid==eid)
		{
		System.out.println(ename);
		}
		else
		System.out.println("invalid eid");
	}

	public void setName(String ename, int eid)
	{
		if(this.eid==eid)
		{
		this.ename=ename;
		}
		else
		System.out.println("invalid eid");
	}

	public void getId(int eid)
	{
		if(this.eid==eid)
		{
		System.out.println(eid);
		}
		else 
		System.out.println("invalid eid");
	}

	public void getDept(int eid)
	{
		if(this.eid==eid)
		{
		System.out.println(edept);
		}
		else
		System.out.println("invalid eid");
	}

	public void setphNo(long Phno,int eid)
	{
		if(this.eid==eid)
		{
		this.phno=phno;
		}
		else
		System.out.println("invalid eid");
	}
	

}
	