package MethodsConcept;

import java.util.Scanner;

public class NonParametericStaticMethods {
//	static float x,z;
//	static int y;
	 
	
	public static float sum(float c, int y) { 

		float sum = c + y;
		float r = sum +60;
		return  r;
		 
	}

	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter two numbers ");
		float m=scn.nextFloat();//67.6f
		int y=scn.nextInt();//90
	
		 

		float res = sum(m,y);//100.6
		 System.out.println(res);
		
		
 		//System.out.println(x+" "+y+" "+z);//90 900 
 	  
	}

}
