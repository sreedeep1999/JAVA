import.java.util.Arrays;
import.java.util.Scanner;
public class StringSort
{
public static void main(String []args)
{
int count=0;
int i,j;
String imp;
Scanner.scan=new Scanner(System.in);
System.out.println("Enter number of strings to sort:");
coutn=scan.nextInt();
String str_list[]=new String[count];
Scanner scan1=new Scanner(System.in);
System.out.println("Enter your string");
for (i=0;i<count;i++)
str_list[i]=scan1.nextLine();
System.out.println("choose 1 or 2 from the menu below");
System.out.println("1:inbuilt-sort()");
System.out.println("2.user-defined-sorting-logic()");
int choice;
choice=scan.nextInt();
switch(choice)
{
case 1:Arrays.sort(str_list);
System.out.println(Arrays.tostring(str_list));
break;
case 2:for(i=0;i<=count-1;i++)
for(j=i;j<str_list.length;j++)
if(str_list[i].computerTo(str_list[j])>
{
tmp=str_list[i];
str_list[i]=str_list[j];
str_list[j]=tmp;
}
System.out.println(Array.toString(str_list));
break;
}
}
}