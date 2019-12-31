package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedtronicsAssignment {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String str = "3D5B3AD54R9D";
		//String a = str.replaceAll("[^A-Za-z]", "");
		//String n = str.replaceAll("[^0-9]", "");
	        
		StringBuffer alpha = new StringBuffer(); 
	    StringBuffer num = new StringBuffer();
	    StringBuffer special = new StringBuffer(); 
	          
	        for (int i=0; i<str.length(); i++) 
	        { 
	            if (Character.isDigit(str.charAt(i))) 
	                num.append(str.charAt(i)); 
	            else if(Character.isAlphabetic(str.charAt(i))) 
	                alpha.append(str.charAt(i)); 
	            else
	                special.append(str.charAt(i)); 
	        } 
	       
	        System.out.println(alpha); 
	        System.out.println(num); 
	        System.out.println(special); 
	        
	        int a = alpha.length();
	        int b = num.length();
	        
	        for(int k=0; k<num.length();k++)
	        {
	        	System.out.println(num.charAt(k));
	        }
	        
	        if(a==b)
	        {
	        	for(int i=0; i<6;i++)
	        	{
	        		for(int j=0; j<num.charAt(i);j++)
	        		{
	        			System.out.println(alpha.charAt(i));
	        		}
	        		
	        	}
	        	System.out.println();
	        } 

	}
}
