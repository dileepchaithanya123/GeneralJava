package general;

public class SwapNoUsingXOR {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		int num2 = 6;
		
		num1 = num1 ^ num2;
		System.out.println(num1);
		num2 = num1 ^ num2;
		System.out.println(num2);
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
