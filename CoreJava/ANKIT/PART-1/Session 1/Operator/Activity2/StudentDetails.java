class StudentDetails
{
public static void main(String[] args)
{
int s=78;
int s_s=89;
int m=99;
int e=88;
int h=67;

System.out.println("Marks in Science is "+s);
System.out.println("Marks in Social Science is "+s_s);
System.out.println("Marks in Math is "+m);
System.out.println("Marks in English is "+e);
System.out.println("Marks in hindi is "+h);

int sum=s+s_s+m+e+h;
int per=sum*100/500;
System.out.println("Total Marks of Ashish is :"+sum);
System.out.println("overall Percentage of Ashish is :"+per+" %");
}

}