package arrays;

import java.util.Arrays;

public class ArrayExample2 {
	
	public static void main(String[] args) {
		
		//Array Declaration and intialization
		Object[] arr = {10,33,23,12, 44};
		
		//Used to sort arrays
		Arrays.sort(arr);
		
		//Print Arrays element list
		for(Object num : arr) {
			System.out.println("Number is "+num);
		}
		
		int searchVal = 3;
		
		int returnPos = Arrays.binarySearch(arr, searchVal);
		
		if(!("returnPos" == "null"))  System.out.println("The search element is present at "+returnPos);
		else System.out.println("Value is not present");
		
		
	}
	
	

}
