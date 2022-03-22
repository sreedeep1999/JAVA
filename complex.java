public class complex
{
double real;
double imag;
public complex(double real, double imag)
{
this.real=real;
this.imag=imag;
}
public static void main(String[] args)
{
complex n1=new complex(2.3, 4.5),
n2= new complex(3.4, 5.0),
temp;
temp =add(n1, n2);
System.out.printf("sum =%.1f + %.1fi", temp.real, temp.imag);
}
public static complex add(complex n1, complex n2)
{
complex temp=new complex(0.0, 0.0);
temp.real=n1.real + n2.real;
temp.imag= n1.imag+ n2.imag;
return(temp);
}
}
