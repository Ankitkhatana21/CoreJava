class LeapYear
{
	public static void main(String[] arg)
	{
		int a=2024;
 
if(a%4==0 && a%100!=0 && a%400==0)
{ 
	System.out.println(a+" is leap year");
	}
	else
	{
	System.out.println(a+" is not leap year");

	}
}
}