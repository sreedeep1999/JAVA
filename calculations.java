import org.calc.*;
import java.util.*;
public class calculations
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number,a:");
int a=sc.nextInt();
System.out.println("Enter a number,b:");
int b=sc.nextInt();
Add add=new Add(a,b);
System.out.println("Addition:a+b="+add.add());
Sub s=new Sub(a,b);
System.out.println("Subtraction:a-b="+s.sub());
Multiply m=new Multiply(a,b);
System.out.println("Multiplication:a*b="+m.mul());
Division d=new Division(a,b);
System.out.println("Division:a/b="+d.div());
}
}


