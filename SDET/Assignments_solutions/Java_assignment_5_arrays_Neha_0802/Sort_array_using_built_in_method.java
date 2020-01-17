//Q7-WAP to sort an array using built in method and display the elements using  foreach  loop.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class Sort_array_using_built_in_method 
	{
	
			public static void main(String[] args) 
			{
				System.out.println("Enter array elements");
				Scanner s=new Scanner(System.in);
				int [] arr=new int[4];
					for(int i=0;i<arr.length;i++)
					{
					arr[i]=s.nextInt(); 
					}
					
					Arrays.sort(arr);
					
					for(int i:arr)
					{
						System.out.println(i);
					}
					
					System.out.println(Arrays.toString(arr));
			}
	}