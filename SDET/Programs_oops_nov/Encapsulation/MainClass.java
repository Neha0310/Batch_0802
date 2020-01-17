package Encapsulation;

import java.util.Scanner;

public class MainClass {
	int sum=900;
	
	public void sum( BasicConcept bconcept){
		int a = bconcept.get_aVal();
		int res = sum+a;
		System.out.println(res);
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		BasicConcept obj =new BasicConcept();
		
		System.out.println("Please enter one number");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();//100
		System.out.println("Please enter second number");
		int y = scn.nextInt();//300
		obj.set_aVal(x);
//		obj.set_bVal(y);
		
//		System.out.println("value of a is "+obj.get_aVal());
//		System.out.println("value of b is "+obj.get_bVal());
		
//		System.out.println("Sum is "+obj.sum());
//		System.out.println("Sum is "+obj.sum);
		mc.sum(obj);
		
		
		
		
		
//		obj.acc_no="234554545677";
//		obj.password="TestUser";
//		System.out.println(obj.password);
	}
}
