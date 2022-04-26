 import java.util.Scanner;
class matrixadd
{
public static void main(String args[])
{
int p,q,m,n,i,j,k;
Scanner S=new Scanner(System.in);
System.out.println("enter the number of rows of first matrix");
p=S.nextInt();
System.out.println("enter the number of columns of first matrix");
q=S.nextInt();
System.out.println("enter the number of rows of second matrix");
m=S.nextInt();
System.out.println("enter the number of columns of first matrix");
n=S.nextInt();
if(p==m&&q==n)
{
int a[][]=new int[p][q];
int b[][]=new int[m][n];
int c[][]=new int[m][n];

System.out.println("enter all the elements of first matrix");
for(i=0;i<p;i++)
for(j=0;j<q;j++)
a[i][j]=S.nextInt();

System.out.println("enter all the elements of second matrix");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=S.nextInt();

System.out.println("first matrix");

for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
System.out.println(a[i][j]+"");
System.out.println("");
}
}


System.out.println("second matrix");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(b[i][j]+"");
System.out.println("");
}
}

for(i=0;i<p;i++)
for(j=0;j<n;j++)
for(k=0;k<q;k++)
c[i][j]=a[i][j]+b[i][j];
System.out.println("matrix after addition");
for(i=0;i<p;i++)
{
for(j=0;j<n;j++)
System.out.println(c[i][j]+"");
System.out.println("");
}
}
else
{
System.out.println(" addition notpossible");
}
}
}











