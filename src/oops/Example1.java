package oops;

public class Example1 {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.sum(10, 20));

		B b = new B();
		System.out.println(b.sum(10,20,30));
		
	}
}


class A
{
	public int sum(int x, int y)
	{
		return (x+y);
	}
	
}

class B extends A
{
	
	public double sum(double x, double y)
	{
		return (x+y);
	}
	
	public int sum(int x, int y, int z)
	{
		return (x+y+z);
	}
	
}