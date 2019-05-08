package general;

public class OverridingExample {
	
	public static void main(String[] args) {
		
		Parent Obj1 = new Parent();
		Obj1.show();
		
		Parent Obj2 = new Child();
		Obj2.show();
		
	}

}

class Parent
{
	void show()
{
		
		System.out.println("Parent's Show method");
	}
}

class Child extends Parent
{
	void show()
	{
		System.out.println("Child show method");
	}
}
