package JAVA_practice_ByStudents;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class SwitchCaseMethod 
{

	public void f1(String str,String choice) 
	{
		switch(choice) 
		{
			case "Anagram" :
				
				System.out.println("this is anagram");
				break;
			case "Palindrom" :
				System.out.println("this is palindrom");
				break;
			case "Reverse" :
				System.out.println("this is reverse");
				break;
		default:
			System.out.println("No operation.");
		}
		
		
	}
	
	public String anagram(String str) 
	{
		String new_str=
		
		return res;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter choice :-Anagram,Palindrom or Reverse");
		String choice=s.nextLine();
		System.out.println("Enter a string");
		String str=s.nextLine();
			if(choice.equalsIgnoreCase("anagram"))
			{
			System.out.println("Enter another string");
			String str=s.nextLine();
			}
		SwitchCaseMethod obj=new SwitchCaseMethod();
		obj.f1(str,choice);
	}

}
