import java.util.*;
public class matrixAdd
{
public static void main(String[] args)
{
int p,q,m,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows in the first matrix:");
p=s.nextInt();
System.out.println("Enter the number of colomn in the first matrix:");
q=s.nextInt();
System.out.println("Enter the no of rows in the second matrix:");
m=s.nextInt();
System.out.println("Enter the no of colomns in the second matrix:");
n=s.nextInt();
if(p==m&&q==n)
{
        int a[][]=new int[p][q];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<p;i++)
        for(int j=0;j<n;j++)
                a[i][j]=s.nextInt();
        System.out.println("Enter the no elements in the second matrix:");
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        b[i][j]=s.nextInt();
        System.out.println("First matrix:");
        for(int i=0;i<p;i++)
        {
        for(int j=0;j<q;j++)
        System.out.print(a[i][j]+"");
        System.out.println("");
        }
        System.out.println("second matrix:");
        for(int i=0;i<m;i++) 
        {
        for(int j=0;j<n;j++)
        {
        System.out.print(b[i][j] + "");
         }
System.out.print("");
}

for(int i=0;i<p;i++)
for(int j=0;j<n;j++)
for(int k=0;k<q;k++)
c[i][j]=a[i][j]+b[i][j];
System.out.println("matrix after addition");
for(int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
System.out.print(c[i][j]+"");
System.out.print("");
}
}
else
{
System.out.println("addition is not possible");
}
}
}
