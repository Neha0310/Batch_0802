package StringProg;

import java.util.Arrays;

public class ReplaceWholeString {

	public static void main(String[] args) {
		String str = "Selenium is an open Source Automation tool";
		String rplcStr = "tool";
		
		String newStr="";
		if(str.contains(rplcStr)) 
		{
			 for(int j=0;j<rplcStr.length();j++) {
				 newStr+="*";
			 }
			 str = str.replace(rplcStr, newStr);
		}
		
		System.out.println(str);
		
		
		
		
		
		
//		String newStr = "";//selenium
////		char[] chArr = str.toCharArray();
////		System.out.println(Arrays.toString(chArr));
//		
//		String[] strArr = str.split(" ");
//		//System.out.println(Arrays.toString(strArr));
//		//[Selenium, is, an, open, Source, Automation, tool]
//		
//		
//		if(str.contains(rplcStr)) 
//		{
//		for(int i=0;i<strArr.length;i++) {
//			
//			System.out.println("enter in outer for loop");
//			 if(strArr[i].equals(rplcStr)) {
//				 System.out.println("enter in if part only if String matched with serached string");
//				 
//				 for(int j=0;j<rplcStr.length();j++) {
//					 System.out.println("enter in inner for loop");
//					 newStr+="*";
//					 System.out.println(newStr);
//				 }
//				 newStr+=" ";
//				 
//			 }else {
//				 System.out.println("enter in else part ");
//				 String strArrElm = strArr[i];
//				 newStr=newStr + strArrElm+" ";
//				 System.out.println(newStr);
//			 }
//		}
//		}else {
//			System.out.println("MAin string doesn't contain Searched string ");
//		}
//		
//		System.out.println(newStr);
	}

}
