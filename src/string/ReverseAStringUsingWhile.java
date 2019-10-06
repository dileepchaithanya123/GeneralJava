package string;

public class ReverseAStringUsingWhile {
	
	public static void main(String[] args) {
		
		String str = "I am Dileep";
		
		int i= str.length();
		while(i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;
		}
	}

}
