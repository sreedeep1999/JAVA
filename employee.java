import java.util.Scanner;
import java.util.Arrays;
class employee1
{
	int eno,esalary;
	String ename;
	public employee1;
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
	System.out.println("NAME=")+ename);
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
