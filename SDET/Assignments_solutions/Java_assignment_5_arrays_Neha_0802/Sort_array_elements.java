// Q1) Sort elements of an array. 
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class Sort_array_elements 
	{
	
		public static void main(String[] args)
		{
			System.out.println("Enter elements into the array");
			int[]arr=new int[5];
			Scanner s=new Scanner(System.in);
				for(int i=0;i<arr.length;i++) 
				{
					arr[i]=s.nextInt();
				}
				//int small;
				for(int a=0;a<arr.length;a++)
				{
				
				for(int i=0;i<arr.length-1;i++) 
				{
					int temp;
						if(arr[i]>arr[i+1]) //70,80,40,90,50//40,50,70,80,90
						{
							temp=arr[i];
							arr[i]=arr[i+1];
							arr[i+1]=temp;
							
						}
					
				}				
				}
	System.out.println(Arrays.toString(arr));
						String even="";
						String odd="";
						for(int i=0;i<arr.length;i++) 
						{
						if(arr[i]%2==0) {
							even=even+arr[i]+",";
						}	
						else {
							odd=odd+arr[i]+",";
						}
						}
						System.out.println("Even numbers:-"+even);
						System.out.println("Odd numbers:-"+odd);
		}
	
	}
