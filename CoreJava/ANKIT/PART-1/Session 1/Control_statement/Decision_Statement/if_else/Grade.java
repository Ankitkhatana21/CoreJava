class Grade
{
public static void main(String[] args)
{
int marks=30;

	if(marks>=90 && marks<=100)
	{
	System.out.println("A+");
	}

	else if(marks>=80 && marks<=89)
	{
	System.out.println("a");
	}

	else if(marks>=70 && marks<=80)
	{
	System.out.println("b");
	}

	else if(marks>=55 && marks<=70)
	{
	System.out.println("c");
	}
	else if(marks>=35 && marks<=54)
	{
	System.out.println("d");
	}

	else 
	{
	System.out.println("Fail");
	}
}
}