package basic;

class A 
{
	public void f1(int x)
	{
		System.out.println("Class A");
		
	}
}
class B extends A
{
	public void f1(int x)
	{
		System.out.println("Class B");
		
	}
}
public class Example2 {
	public static void main(String args[])
	{
		B b1=new B();
		b1.f1(5);
		b1.f1(5);
		
	}

}

