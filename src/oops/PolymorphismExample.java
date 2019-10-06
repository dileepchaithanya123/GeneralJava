package oops;

public class PolymorphismExample{
	
	//We are overloading sum method
	public int sum(int x, int y)
	{
		return x+y;
	}
	
	//We are overloading sum method
	public int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	
	//We are overloading sum method
	 
	public double sum(double x, double y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		
		PolymorphismExample s = new PolymorphismExample();

		System.out.println(s.sum(10,32));
		System.out.println(s.sum(10,32,43));
		System.out.println(s.sum(10.9382,32.34));
		
	
	}

}


