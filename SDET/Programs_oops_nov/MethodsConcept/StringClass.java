package MethodsConcept;

import java.util.Scanner;

public class StringClass {
	public static String reverseOfString(String fname,String lname) {
		char ch=0;
		String revStr = "";
		 
		for(int i=fname.length()-1;i>=0;i--) {
			ch =fname.charAt(i);	//c
			revStr =revStr+ch;//"c-->cba
		}
		revStr=revStr+" ";
		for(int i=lname.length()-1;i>=0;i--) {
			ch =lname.charAt(i);	//c
			revStr =revStr+ch;//"c-->cba
		}
		
		return revStr;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("Please enter your name");
		String first_name = scn.nextLine();
		String last_name = scn.nextLine();
		 
		String c  = reverseOfString(first_name,last_name);//Sharma
		System.out.println(c);
		
		 
	}

}
