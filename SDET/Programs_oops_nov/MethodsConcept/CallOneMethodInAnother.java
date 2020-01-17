package MethodsConcept;

import java.util.Scanner;

public class CallOneMethodInAnother {
	public double sum(double x,double y) {
		double sum = x + y;
		 return sum;
	}
	
	public double avg(double x , double y) {
		 double sum = sum(x,y);
		 double avg = sum/2;
		 return avg;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("Please enter first number");
		double a = scn.nextDouble();//100
		System.out.println("Please enter first number");
		double b = scn.nextDouble();//200
		
		CallOneMethodInAnother obj = new CallOneMethodInAnother();
		double avg = obj.avg(a,b);
		System.out.println(avg);
	 
	}
}
