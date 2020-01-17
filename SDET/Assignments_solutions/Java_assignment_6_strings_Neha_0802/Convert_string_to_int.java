//How to convert numeric String to int in Java?

import java.util.Scanner;
public class Convert_string_to_int 
{

	public static void main(String[] args)
	{
		String str="12390";
		int a;
		int b;
		a=Integer.valueOf(str);
		b=Integer.parseInt(str);
		System.out.println(a);
		System.out.println(b);

	}

}
