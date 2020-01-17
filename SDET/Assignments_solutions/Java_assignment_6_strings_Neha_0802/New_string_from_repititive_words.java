//Make a new String from existing String of repeated Strings/Duplicate String.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class New_string_from_repititive_words 
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a string .");
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			String[] s_arr=str.split(" ");
			String new_str="";
				for(int i=0;i<s_arr.length;i++) 
				{
						for(int j=i+1;j<s_arr.length;j++) 
						{
							if(s_arr[i].equals(s_arr[j])) 
							{
					        new_str=new_str+s_arr[i]+" ";	
							break;
							}
					     }
				}
		System.out.println(new_str);

		}
	
	}