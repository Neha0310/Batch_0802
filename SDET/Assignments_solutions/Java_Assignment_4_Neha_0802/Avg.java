import java.util.Scanner;
	public class Avg
	{
	
			public static void main(String[] args)
			{
				System.out.println("Please enter 10 numbers");
				Scanner s=new Scanner(System.in);
				int sum=0;
					for(int i=1;i<=10;i++)
					{
						int n=s.nextInt();
						sum=sum+n;
						}
				int average=sum/10;
				System.out.println("Sum of numbers: "+sum);
				System.out.println("Average of numbers: "+average);
			
			}
	
	}
