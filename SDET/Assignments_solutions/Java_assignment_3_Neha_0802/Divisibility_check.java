//Program to check whether a number is divisble by 5 and 11.
import java.util.Scanner;
	public class Divisibility_check
	{
			public static void main(String[] args) 
			{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=s.nextInt();
		if((n%5==0) && (n%11==0))
		{
			System.out.println("Number is divisible by both 5 and 11");
		}
		else if((n%5==0) && (n%11!=0)) 
		{
			
			System.out.println("Number is divisible by 5 but not by 11");
		}

		else if((n%5!=0) && (n%11==0)) 
		{
			
			System.out.println("Number is divisible by 11 but not by 5");
		}

		else if((n%5!=0) && (n%11!=0))
		{
			
			System.out.println("Number is neither divisible by 5 nor 11");
	}
			}
		}