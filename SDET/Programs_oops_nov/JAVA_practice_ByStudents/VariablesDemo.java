package JAVA_practice_ByStudents;

import java.util.Scanner;

public class VariablesDemo {
	static int a;
	int b;
	
	
	
	

	public static void main(String[] args) {
		VariablesDemo obj = new VariablesDemo();
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		System.out.println(a);

		System.out.println(VariablesDemo.a);
		System.out.println(obj.b);

	}
}
