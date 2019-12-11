package assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num;
		int a,b = 0;
		int c=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times :");
		num = sc.nextInt();
		
		for(int i=0; i<=num; i++)
		{
			a = b;
			b = c;
			c = a+b;
			
			System.out.print(a + " ");
			
			sc.close();
		}
		
	}
}
