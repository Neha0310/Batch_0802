//Write a program to search for a word in a String and replace all of its occurrences.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class Replace_word_in_string 
	{
	
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter string.");
	String str=s.nextLine();		
	System.out.println("Enter word to be replaced.");
	String word1=s.nextLine();
	System.out.println("Enter replacement word.");
	String word2=s.nextLine();
	String [] arr=str.split(" ");
	String new_str="";
	//System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i].equals(word1)) 
			{
				arr[i]=word2;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			new_str+=arr[i]+" ";
		}
	System.out.println(new_str);
		}
	
	}
