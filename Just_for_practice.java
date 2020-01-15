import java.util.Scanner;
	public class Just_for_practice
	{
		public static void main(String[] args)
		{
			Scanner s_obj=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=s_obj.nextInt();
			int half=(n+1)/2;
			int l=0;
				for(int i=1;i<=n;i++)
				{
					for(int sp=1;sp<=n-i;sp++)
					{
						System.out.print(" ");
					}
					if(i%2!=0||i==1){
					for(int j=1;j<=i+l;j++)
					{
					                        	
						System.out.print("*");
					}l++;
					
					System.out.println("");
				}
				}
		}
	}