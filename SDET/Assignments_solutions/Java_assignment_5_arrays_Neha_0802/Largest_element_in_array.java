// Q-3,4,6) Largest element in an array and its index number.
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Largest_element_in_array {

	public static void main(String[] args) {
		System.out.println("Enter size of an array");
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter values into array");
		int [] arr=new int[n];
		for(int i=0;i<=n-1;i++)    //i<arr.length
		{
			arr[i]=s.nextInt();
		}
			        int temp=0;
			        int temp2=0;
					for(int i=0;i<arr.length;i++)  //(10,5,20,40)
					{
						if(arr[i]>temp) 
						{
							temp2=temp;
							temp=arr[i];
							
						}
					
					
					} 
			
					System.out.println("Second largest no.= "+ temp2);
					System.out.println("Largest no.= "+temp);
					
				
	for(int i=0;i<arr.length;i++) 
	{
		if(arr[i]==temp)
		{
			System.out.println("Index of largest= "+i);
		}
	}
	}
}
