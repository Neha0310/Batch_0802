//Q2)-Search elements from an array
import java.util.Scanner;
import java.util.Arrays;
	public class Search_element_from_array 
	{
			public static void main(String[] args)
			{
				// string array
				boolean flag=false;
				Scanner s=new Scanner(System.in);
				String []arr=new String[4];
				System.out.println("Enter string elements into an array");
					for(int i=0;i<arr.length;i++)
					{
					arr[i]=s.nextLine();
					}
				System.out.println("Enter string to be searched");
				String st=s.nextLine();
				int i;
					for(i=0;i<arr.length;i++)
					{ 
						if (arr[i].equals(st))
						{ 
							flag=true;
				            break;
						}
					}
				if(flag==true) 
				    {
					System.out.println("Element is at :-"+i+" Index number");
					}
				
				else 
				{
					System.out.println("Element not found");
				}
				
			}
		
	}
