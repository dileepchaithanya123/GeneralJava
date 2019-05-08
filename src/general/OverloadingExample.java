package general;

public class OverloadingExample {

	public static void main(String[] args) 
	{
		
		OverloadingExample s = new OverloadingExample();
		System.out.println(s.sum(10,2));
		System.out.println(s.sum(10.9,2.3));
		System.out.println(s.sum(10,2,9));
	
	}

	public int sum(int x, int y) 
	{
		return(x+y);
	}
	
	public int sum(int x, int y, int z) 
	{
		return(x+y+z);
	}
	
	public double sum(double x, double y)
	{
		return(x+y);
	}

}
