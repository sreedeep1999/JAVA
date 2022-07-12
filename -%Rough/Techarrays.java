import java.util.Scanner;
class person
{
String p_name;
String p_gender;
int p_age;
person()
{
}
person(String name,String gen,int eage)
{
this.p_name=name;
this.p_gender=gen;
this.p_age=eage;
}
}
class Employee extends person
{
int empid;
String cname;
String qualification;
float salary;
Employee(String name,String gen,int eage,int id,String cmname,String qualif,float sal)
{
super(name,gen,eage);
this.empid=id;
this.cname=cmname;
this.qualification=qualif;
this.salary=sal;
}
}
class Teacher extends Employee
{
String subject;
String department;
int teacher_id;
Teacher(String name,String gen,int eage,int id,String cmname,String qualif,float sal,String subj,String dept,int tid)
{
super(name,gen,eage,id,cmname,qualif,sal);
this.subject=subj;
this.department=dept;
this.teacher_id=tid;
}
public void showData()
{
System.out.println("name="+p_name);
System.out.println("gender="+p_gender);
System.out.println("age="+p_age);
System.out.println("id="+empid);
System.out.println("companyname="+cname);
System.out.println("qualification="+qualification);
System.out.println("salary="+salary);
System.out.println("subject="+subject);
System.out.println("department="+department);
System.out.println("teacherid="+teacher_id);
}
}
public class Techarrays
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("\n Enter the details \n");
Teacher persons[]=new Teacher[n];
Scanner sc1=new Scanner(System.in);
String name;
String gen;
int age;
int id;
String companyname;
String qualification;
float salary;
String subj;
String depart;
int teach_id;
for(int i=0;i<n;i++)
{
System.out.println("Enter the Next persons id");
System.out.println("enter the name \n");
name=sc1.next();
System.out.println("Enter the gender\n");
gen=sc1.next();
System.out.println("Enter the age\n");
age=sc1.nextInt();
System.out.println("Enter the id\n");
id=sc1.nextInt();
System.out.println("Enter the company name\n");
companyname=sc1.next();
System.out.println("Enter the qualification\n");
qualification=sc1.next();
System.out.println("Enter the salary\n");
salary=sc1.nextFloat();
System.out.println("Enter the subject\n");
subj=sc1.next();
System.out.println("Enter the department\n");
depart=sc1.next();
System.out.println("Enter the teacherid\n");
teach_id=sc1.nextInt();
Teacher s=new Teacher (name,gen,age,id,companyname,qualification,salary,subj,depart,teach_id);
persons[i]=s;
}
for(Teacher y:persons)
{
y.showData();
}
System.out.print(" \n");
}
}

