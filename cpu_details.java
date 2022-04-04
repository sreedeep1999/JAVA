class cpu
{
double price;
class processor
	{
	double core;
	String manufacture;
	double getcache()
	{
	return 4.3;
	}
	}
protected class ram
	{
	double memory;
	String manufacture;
	double clockspeed()
	{
	return 5.5;
	}
	}
}
public class cpu_details
{
	public static void main (String args[])
	{
	cpu obj1=new cpu();
	cpu.processor obj2=obj1.new processor();
	cpu.ram obj3=obj1.new ram();
	
System.out.println("processor cache is" +obj2.getcache());
System.out.println("Ram clockspeed is " +obj3.clockspeed());
}
}
