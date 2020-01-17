import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args)
	{
		
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Please enter any number");
		int n=scn.nextInt();
		int star=0,space=0;
		 int half=(n+1)/2;
		for(int i=1;i<=n;i++) 
		{
			if(i<=half) {
				star=i;
				space=half-i;
			}else {
				star--;
				space++;
			}
			
			for(int sp=1;sp<=space;sp++) {
				System.out.print(" ");
			}
			
			
			for(int st=1;st<=star;st++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
