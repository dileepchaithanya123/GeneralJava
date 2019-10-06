package string;

public class ReverseAStringUsingForLoop {
	
	public static void main(String[] args) {
		
		
		String str = "I am Dileep";
		
		for(int i=str.length()-1;i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
