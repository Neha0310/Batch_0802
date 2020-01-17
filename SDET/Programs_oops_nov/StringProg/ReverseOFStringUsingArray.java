package StringProg;

import java.util.Arrays;

public class ReverseOFStringUsingArray {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		System.out.println(str1);
//		String str = "Automation";
//		//Convert String to Array
//		char[] chArr = str.toCharArray();//['a','u','t','o']
//		String newStr="";
//		for(int i=chArr.length-1;i>=0;i--) {
//			newStr=newStr+chArr[i];	
//		}
//		System.out.println(newStr);

		System.out.println("=============using tocharArray()");
		String str = "tesing is important for development";
		char[] chArr = str.toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		System.out.println("=============using split()");
		String[] stArr = str.split(" ");
		System.out.println(Arrays.toString(stArr));
		String newStr = "";
		for(String val : stArr) {
			newStr += val;
			
		}
		
		System.out.println(newStr);
	}

}
