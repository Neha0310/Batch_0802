//Calculate occurance of  word in a string.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
	public class Occurance_of_word_in_string 
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a string.");
			Scanner obj=new Scanner(System.in);
			String str=obj.nextLine();
			System.out.println("Enter a word.");
			String word=obj.nextLine();
			String[] s_arr=str.split(" ");
			int count=0;
				for(int i=0;i<s_arr.length;i++)
				{
					if(s_arr[i].equals(word))
					{
						count++;
					}
				}
				System.out.println(word +" occurs "+count+" times.");

	
		}
	
	}
