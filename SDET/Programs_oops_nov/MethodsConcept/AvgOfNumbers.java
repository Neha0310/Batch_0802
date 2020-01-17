package MethodsConcept;

import java.util.Scanner;

public class AvgOfNumbers {
    
	public double sum(double x,double y) {
		double sum = x + y;
		 return sum;
	}
	
	public double avg(double s ) {
		double avg = s /2;
		return avg;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("Please enter first number");
		double a = scn.nextInt();//100
		System.out.println("Please enter first number");
		double b = scn.nextInt();//200
		
		AvgOfNumbers obj = new AvgOfNumbers();
		double sum = obj.sum(a,b);
		System.out.println("Sum is-"+sum);
		double result = obj.avg(sum);
		System.out.println("Avg is-"+result);
		
		
		
		 
		
	}

}
