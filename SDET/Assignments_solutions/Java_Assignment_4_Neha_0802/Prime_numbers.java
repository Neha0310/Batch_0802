import java.util.Scanner;
	public class Prime_numbers {
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Enter a number");
				Scanner s=new Scanner(System.in);
				boolean flag=false;
				for(int ip=1;ip<=5;ip++) {
				 int n=s.nextInt();
					for(int i=2;i<=n/2;i++)//i<=n-i is not an optimised way
					{
						if(n%i==0) {
							flag=true;
							break;
						}
						else {
							flag=false;
						}
					}
				if(flag==true) {
					System.out.print("Number is not a Prime");
				}
				else {
					System.out.println("Number is Prime");
				}	}
			}
	}