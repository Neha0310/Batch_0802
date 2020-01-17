package StringProg;

import java.util.Arrays;

public class StringCountChrs {

	public static void main(String[] args) {
		String str = "Automation";
		//Convert String to Array
		char[] chArr = str.toCharArray();//['a','u','t','o']
		System.out.println(Arrays.toString(chArr));
		
		//System.out.println(chArr.length);
		/*using for loop*/
		int count=0;
		for(int i=0;i<chArr.length;i++) {
			count++;
		}
		
		System.out.println(count);
		/*using foreach loop*/
		int count1=0;
		for(char ch :chArr) {
			count1++;
		}
		System.out.println(count1);
		
	}

}
