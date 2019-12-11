package assignments;

public class ReverseAString2 {
	
	public static void main(String[] args) {
		
		String str = "Dileep is a good boy";
		char chars[] = str.toCharArray();
		
		for(int i = chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
		}
	}

}
