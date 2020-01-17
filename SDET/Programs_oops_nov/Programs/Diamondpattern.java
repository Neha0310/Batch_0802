import java.util.Scanner;

public class Diamondpattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int n = sc.nextInt();//5
		for(int i=1;i<=n;i++) 
		{
			//for spaces
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print("-");
			}
			
			//for stars
			for(int st=1;st<=(n+1)-i;st++) {
				System.out.print("* ");
			}
			
		    System.out.println("");
		}

	}

}
