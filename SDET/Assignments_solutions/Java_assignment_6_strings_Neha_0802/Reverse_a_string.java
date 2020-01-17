//Reverse a String with three different methods

import java.lang.String;
import java.util.Arrays;
	public class Reverse_a_string 
	{
	
			public static void main(String[] args)
			{
				String str="Hello neha welcome to java .";
//----------method 1--------------------------
		        StringBuilder input1 = new StringBuilder(); 
		        input1.append(str); 
		        
		        // reverse StringBuilder input1 
		        input1 = input1.reverse(); 
		  
		        // print reversed String 
		        System.out.println(input1); 
//--------------method 2-----------------------------
		        String new_str="";
		        char[] s_arr=str.toCharArray();
		        for(int i=s_arr.length-1;i>=0;i--)
		        {
		        	new_str=new_str+s_arr[i];
		        }
		        System.out.println(new_str);
//------------------method 3--------------------------
		   StringBuffer sb=new StringBuffer(str);
		   System.out.println(sb.reverse());
		        
		   
			}
	
	}
