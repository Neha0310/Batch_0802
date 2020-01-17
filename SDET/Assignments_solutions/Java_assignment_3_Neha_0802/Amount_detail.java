//Program to count total number of 500,100,50,20 and 10 notes in a given amount
import java.util.Scanner;
	public class Amount_detail 
	{
	
			public static void main(String[] args)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter an amount");
				int n=s.nextInt(); //2660
				int temp=n;
				int five=n/500;  //5
		System.out.println("500 rupee notes: "+five);
		n=n-(five*500);//2660-2500=160
		int hundred=n/100;//16
		System.out.println("100 rupee notes :"+hundred);
		n=temp-(five*500+hundred*100);//2660-2600=60
		int fifty=n/50;
       System.out.println("50 rupee notes :"+fifty);
       n=temp-(five*500+hundred*100+fifty*50);//2660-2650=10
       int ten=n/10;//1
       System.out.println("10 rupee notes: "+ten);
			}
	}
