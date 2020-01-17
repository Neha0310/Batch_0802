//Program to check whether number is positive or negative number.
import java.util.Scanner;
		public class Sign_check 
		{
				public static void main(String[] args)
			   {
					System.out.println("Enter a number");
			        Scanner s=new Scanner(System.in);
			        int n=s.nextInt();
					if(n>0) {
						System.out.println("Number is positive");
					}
					else if(n<0) {
						System.out.println("Number is negative");
					}
					else {
						System.out.println("Number is Zero");
					}
			
				}
	
	 }
