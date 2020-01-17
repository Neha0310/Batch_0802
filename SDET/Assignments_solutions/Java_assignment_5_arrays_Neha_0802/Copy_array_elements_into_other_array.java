//Q11-Copy array elements into new array.
import java.util.Scanner;
import java.util.Arrays;
	public class Copy_array_elements_into_other_array
	{
	
		public static void main(String[] args)
		{
			System.out.println("Enter elements in array");
			int arr[]=new int[4];
			Scanner s=new Scanner(System.in);
				for(int i=0;i<arr.length;i++) 
				{
					arr[i]=s.nextInt();
				}
	        int arr1[]=new int[4];
			for(int i=0;i<arr.length;i++) 
			{ 
			
					arr1[i]=arr[i];
				
				}
			System.out.println(Arrays.toString(arr1));
			}
		
	
	}
