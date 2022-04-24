import java.util.Scanner;
import java.util.Arrays;
class employee1
{
	int eno,esalary;
	String ename;
	public employee1() 
	{
	}
public employee1(int no,int sal,String name)
{
	eno=no;
	esalary=sal;
	ename=name;
}
public void showData()
{
	System.out.println("EMPID="+eno);
	System.out.println("NAME="+ename);
	System.out.println("SALARY="+esalary);
}}
public class employee
{
public static void main(String args[])
{
System.out.println("enter no of employees");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the employee details one by one\n");
employee1 employees[]=new employee1[n];
Scanner sc_emp=new Scanner(System.in);
int eid,esal;
String ename;
for(int i=0;i<n;i++)
{
System.out.println(" enter "+i+"employee details \n");
System.out.println("enter employe id(integer):\n");
eid=sc_emp.nextInt();
System.out.println("Enter employee name(String):\n");
String name=sc_emp.next();
ename=new String(name);
System.out.println("enter employee salary(integer):\n");
esal=sc_emp.nextInt();
employee1 emp=new employee1(eid,esal,ename);
employees[i]=emp;
}
System.out.println("Employees are:\n");
for(employee1 y:employees) 
y.showData();
System.out.println("enter employee no to search:\n");
int semp=sc.nextInt();
boolean found=false;
for(employe1 e:employees) 
{
if(semp==e.eno) 
{
found=true;
System.out.println("Employee found");
e.showData();
break;
}
}
if(!found) 
{
System.out.println("Employee not found");
}
}
}





