class Employee
{

String ename;
int eid;

Employee()
{
System.out.println("no argument");
}

Employee(String ename)
{
this.ename=ename;
System.out.println(ename);
}

Employee(String ename, int eid)
{
this.ename=ename;
this.eid=eid;
System.out.println(ename+" "+eid);
}

public static void main(String[] args)
{
	Employee a = new Employee();
        Employee b = new Employee("tanuj");
  	Employee c = new Employee("tanuj", 8);
}
}