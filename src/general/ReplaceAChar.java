package general;

public class ReplaceAChar {

	public static void main(String[] args) {
		
	String name ="taste the thunder";
	String name2 = null;
	
	//String name2 = name.replace("t","1").replace("t","2").replace("t", "3").replace("t", "4");
	
	//String value = "1";

	for(int i=0;i<name.length();i++)
	{
		String value = "1";
		name2 =  name.replace("t",value);
		//value = value + 1;
		
		
	}
		
	System.out.println(name2);
		
		

	}

}