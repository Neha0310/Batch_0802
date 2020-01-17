//How to check if two String are Anagram?

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

	public class Anagram_string
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter first string.");
			Scanner s=new Scanner(System.in);
			
			String s1=s.nextLine();
			System.out.println("Enter second string.");
			String s2=s.nextLine();
			boolean flag=false;
			//char [] c1=new char[s1.length()];
			//char [] c2=new char[s2.length()];
			
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
				for(int i=0;i<c2.length;i++)
				{   flag=false;
					for(int j=0;j<c1.length;j++) 
					{   
						if(c2[i]==c1[j]) 
						{
							flag=true;
							//System.out.println("c");
						}
						}
						if(flag==false) 
						{
							break;
						}
						
					}
				if(flag==true)
				{
					System.out.println("Anagram");
				}
				else 
				{
					System.out.println("Not an Anagram");
				}
				}
	}
	