//Calculate occurance of single character in a string.

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class Occurance_of_character_in_string 
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a string.");
			Scanner obj=new Scanner(System.in);
			String str=obj.nextLine();
			System.out.println("Enter character");
			char c=obj.next().charAt(0);		
			int count=0;
		       for(int i=0;i<str.length();i++)
		       {
		    	   if(str.charAt(i)==c) 
		    	   {
		    		   count++;
		    	   }
		       }
	       System.out.println(c+" occurs "+count +" times in this string.");
		}
	
	}
