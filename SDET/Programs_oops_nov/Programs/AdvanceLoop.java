import java.util.Scanner;

public class AdvanceLoop {
	public static void main(String[] args) 
	{
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter any total no of rows");
		 int n = scn.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	}
}
