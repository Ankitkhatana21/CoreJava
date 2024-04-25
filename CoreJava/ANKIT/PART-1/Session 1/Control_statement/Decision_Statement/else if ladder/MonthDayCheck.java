class MonthDayCheck
{
	public static void main(String[] args)
	{
		int a=5;

		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
		{
			System.out.println("31 Days");
		}

		else if(a==2)
		{
			System.out.println("28 or 29 Days");
		}
		else if(a==4 || a==9||a==6||a==11)
		{
			System.out.println("30 Days");
		}
		else
		{
				System.out.println("invalid");
		}
	}
}
