//First letter should be capital of every word in a String.

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class First_letter_capital_in_string
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a string.");
			Scanner obj=new Scanner(System.in);
			String str=obj.nextLine();
			String new_str="";
			//String [] s_arr=str.split(" ");
			for(int i=0;i<str.length();i++) 
			{
				if(i==0||str.charAt(i-1)==' '||str.charAt(i-1)=='.') 
				{
				new_str+=Character.toUpperCase(str.charAt(i)); 
				}
				else 
				{
					new_str+=str.charAt(i);
				}
			}
          System.out.println(new_str);
		}
	
	}
