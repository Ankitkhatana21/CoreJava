class SpecialCharOrNot1
{
public static void main(String[] args)
{
char ch='#';


if(ch<=33 && ch>=38 ||ch<=40 && ch>=43 || ch==64|| ch<=94 && ch>=95)
{
System.out.println(ch+ " is Special Char");
}
else
{
System.out.println(" Not Special Char");
}
}
}