class SpecialCharOrNot
{
public static void main(String[] args)
{
char ch='j';

String check=(ch<=33 && ch>=38 ||ch<=40 && ch>=43 || ch==64|| ch<=94 && ch>=95)?"Special char":"Not Special Char";

System.out.println(check);
}
}