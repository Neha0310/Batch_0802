//Q8-WAP to find the sum of an array elements.
import java.util.Scanner;
import java.util.Arrays;
	public class Sum_of_array 
	{
	
			public static void main(String[] args) 
			{
				System.out.println("Enter elements in array.");
				Scanner s=new Scanner(System.in);
				int[] arr=new int[4];
					for(int i=0;i<arr.length;i++)
					{
						arr[i]=s.nextInt();
					}
					int sum=0;
				for(int i=0;i<arr.length;i++)
				{
				sum=sum+arr[i];
				}
				System.out.println("Sum of array elements:- "+sum);
			}
	
	}
