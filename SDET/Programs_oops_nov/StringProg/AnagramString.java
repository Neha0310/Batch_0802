package StringProg;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		 String str = "listens";
		 String str1 = "silent";
		 // convert string into array 
		char[] chArr= str.toCharArray();
		char[] chArr1= str1.toCharArray();
		Arrays.sort(chArr);
		Arrays.sort(chArr1);
		
		System.out.println(Arrays.toString(chArr));
		System.out.println(Arrays.toString(chArr1));
		boolean res=false;
		for(int i=0;i<chArr.length;i++) {
			if(chArr[i]!=chArr1[i]) {
				res=true;
				break;
			}
		}
		
		if(res) {
			System.out.println("Not an Anagram");
		}else {
			System.out.println("Anagram");
		}
		
		
	}

}
