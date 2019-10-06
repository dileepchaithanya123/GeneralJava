package arrays;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		int[] arr = {19,83,920,72,90};
		
		String[] st = {"Dileep","Chaithanya","Anusha","Vivek","Bhagyalakshmi"};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(st));
		Arrays.sort(st);
		System.out.println(Arrays.toString(st));
	}

}
