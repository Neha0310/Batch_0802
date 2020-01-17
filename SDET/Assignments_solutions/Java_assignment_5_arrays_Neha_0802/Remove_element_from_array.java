//Q 5-WAP to remove element from specific index number.
import java.util.Scanner;
import java.util.Arrays;
	public class Remove_element_from_array 
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
				 System.out.println(Arrays.toString(arr));
		System.out.println("Enter index number,you want to empty");
        int i_num=s.nextInt();
        arr[i_num]=0;
        System.out.println(Arrays.toString(arr));
		}
	
	}
