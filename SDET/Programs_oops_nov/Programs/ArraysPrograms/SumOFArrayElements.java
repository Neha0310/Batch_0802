package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOFArrayElements {

	public static void main(String[] args) {
		
		String str="Automation";
		System.out.println(str.charAt(9));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		int x= str.length();
		str.toUpperCase();
		char[] ch=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//for each
		for(char val :ch) {
			System.out.println(val);
		}
		
		// array Elements traverse
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		// String Reverse
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
/*//		Scanner scn = new Scanner(System.in); 
//		System.out.println("Please enter the size of an array");
//		int size = scn.nextInt();
//		 
//		
//		int[] arr = new int[size];
//		for(int i=0;i<arr.length;i++) {
//			 System.out.println("Please enter "+i+" element");
//			 arr[i]=scn.nextInt();
//			  
//		}
//		System.out.println("===============");
//		System.out.println(Arrays.toString(arr));
//		
//		int sum=0;//4->8
//		for(int i=0;i<arr.length;i++) {
//			sum = sum + arr[i] ;//4 +4
//		}
//		
//		System.out.println(sum);
*/	

	}

}
