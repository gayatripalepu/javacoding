import java.lang.*;
class Employee
{
private int empid;
private String ename;
private double sal;
public void setEmployee(int empid,String ename,double sal)
{
this.empid=empid;
this.ename=ename;
this.sal=sal;
}
public void setEmployee(int empid,String ename)
{
this.empid=empid;
this.ename=ename;
this.sal=5000.00;
}

public void getEmployee()
{
System.out.println(empid+" "+ename+" "+sal);
}
}
public class MOL
{
public static void main(String args[])
{
Employee emp=new Employee();
emp.setEmployee(1,"gayatri",1000.00);
emp.getEmployee();
emp.setEmployee(2,"karthikeya");
emp.getEmployee();
}
} 