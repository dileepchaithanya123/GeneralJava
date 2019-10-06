package constructor;

public class ParameterizedContructor {
	
	String Empname;
	int Empage;
	
	
	 public ParameterizedContructor(String name, int age) 
	 { 
		 	this.Empname = name;
		 	this.Empage = age;
	 }
	 
	
	void info() 
	{
		System.out.println("Employee Name is "+Empname+ " and his age is "+Empage);
	}
	
	public static void main(String[] args) 
	{
		
		ParameterizedContructor pc = new ParameterizedContructor("Dileep",28);
		pc.info();
	}
	
	

}
