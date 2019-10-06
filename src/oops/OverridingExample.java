package oops;

public class OverridingExample {
	
	public static void main(String[] args) {
		
		
		parent p = new parent();
		p.show();
		
		parent c = new child();
		c.show();
		
	}
	
}

class parent
{
	void show() 
	{
			System.out.println("Parent Class show method");
	}
}

class child extends parent
{
	void show()
	{
		System.out.println("Child Class show method");
	}
}

