import  java.util.Scanner;
	public class Factorial {
	
			public static void main(String[] args) 
			{
				Scanner scn=new Scanner(System.in);
				System.out.println("Enter a number");
				int n = scn.nextInt();
				//int n=6;
				int num=1;
					for(int i=1;i<=n;i++)
					{
					num=num*i;		
					}
				System.out.println(num);
				scn.close();
			}
	}
