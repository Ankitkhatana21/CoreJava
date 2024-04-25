class MethodVoweldef
{
	public static void main(String[] args)
	{
		
		char A='i';
		m1(A);
	}


	protected static void m1(char A)
	{
		
		if(A=='a'||A=='e'||A=='i'||A=='o'||A=='u'||A=='A'||A=='E'||A=='I'||A=='O'||A=='U')
		{
  		System.out.println("The char "+ A+ " is Vowel");
		}
		else
		{
			System.out.println("The char "+ A + " is not Vowel");
		}	
	}
}