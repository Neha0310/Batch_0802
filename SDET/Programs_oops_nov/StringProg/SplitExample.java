package StringProg;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter String");
		//String str = scn.nextLine();
		String str = "id###testing###user###email@@@test@gmail.com@@@password";
		
		str = str.substring(5);
		System.out.println(str);
		
//		String[] strArr = str.split("@@@");
//		
//		System.out.println(Arrays.toString(strArr));
//		for( String val: strArr) {
//			if(val.contains("###")) {
//				String[] arr2  = val.split("###");
//				for( String val2: arr2) {
//					System.out.println(val2);
//				}
//			}else {
//				System.out.println(val);
//			}
//			
//			
//		}

	}

}
