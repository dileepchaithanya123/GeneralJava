package string;


public class ReverseAString {
	
	public static void main(String[] args) {
		
		/*
		 * System.out.println("Enter a String :");
		 * 
		 * Scanner r = new Scanner(System.in);
		 * 
		 * String str = r.nextLine();
		 */
		
		String str = "I like testing";
		
		StringBuilder sb = new StringBuilder(str);
		
		//System.out.println("Reverse string is ");
		System.out.println(sb.reverse().toString());
	}

}
