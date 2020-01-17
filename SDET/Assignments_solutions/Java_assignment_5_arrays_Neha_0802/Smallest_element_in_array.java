//3) Smallest number in an array.
import java.util.Scanner;
import java.util.Arrays;
	public class Smallest_element_in_array 
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter size of an array");
			
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println("Enter values into array");
			int [] arr=new int[n];
				for(int i=0;i<=n-1;i++)    //i<arr.length
				{
					arr[i]=s.nextInt();
				}
				int small=arr[0];
				for(int i=0;i<arr.length;i++) 
				{
				if(arr[i]<small)//20,10,30,5,60
				{
					small=arr[i];
				}	
				}
				System.out.println("Smallest number= "+small);
			
		}
	
	}
