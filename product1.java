class product
{
String pname,pcode;
int price;
public String getpname()
{
return pname;

}
public product()
{
}
public product(String pname,String pcode,int price)
{
this.pname=pname;
this.pcode=pcode;
this.price=price;
}
public void setpname(String pname)
{
this.pname=pname;
}
public void display()
{
System.out.println("name"+pname);
System.out.println("name"+pcode);
System.out.println("name"+price);
}
}

class product1
{
public static void main(String args[])
{
product p1=new product();
p1.pname="soap";
p1.display();
product p2=new product("phone","1212",5000);
p2.display();
product p3=new code();
p3.display();
 
}
}



