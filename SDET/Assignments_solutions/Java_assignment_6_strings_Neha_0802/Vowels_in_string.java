//Calculate existing of vowels in a string.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

	public class Vowels_in_string 
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a string.");
			Scanner obj=new Scanner(System.in);
			String str=obj.nextLine();
			
			String v_str="";
			String c_str="";
			int v_count=0;
			int c_count=0;
			for(int i=0;i<str.length();i++)
			{
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') 
			 {
				 v_count++;
				 v_str=v_str+str.charAt(i);
			 }
			 else 
			 { if(str.charAt(i)!=' ') {
				 c_count++;
				 c_str=c_str+str.charAt(i); }
			 }
			 }
			System.out.println("Total vowels :- "+v_count);
			System.out.println("vowels:- "+v_str);
			System.out.println("Total Consonants:- "+c_count);
			System.out.println("Consonants:- "+c_str);
			}
	
	}
