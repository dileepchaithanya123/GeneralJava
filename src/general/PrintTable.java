package general;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j=1; j<=10; j++)
		{
			System.out.println(i+" X "+j+ " = "+(i*j));
		}
	}

}
