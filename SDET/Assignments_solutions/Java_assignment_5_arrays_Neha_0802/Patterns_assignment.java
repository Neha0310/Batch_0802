//Q12-Print patterns.
import java.util.Scanner;
	public class Patterns_assignment
	{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter a number for pattern.");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
//----------------1st-----------------------			
				for(int i=1;i<=n;i++) 
				{
					for(int sp=0;sp<=n-i;sp++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) 
					{
						System.out.print(j);
					}
					for(int j=i-1;j>0;j--) 
					{
						System.out.print(j);
					}
					System.out.println("");
				}
//----------------2nd----------------------------
				
				for(int i=1;i<=n;i++) 
				{
					if(i%2!=0) 
					{
				for(int sp=1;sp<=n-i;sp++) 
				{
					System.out.print(" ");
				}			
					for(int st=1;st<=i;st++) 
					{
						System.out.print("*");
					} 
				
				System.out.println("");	
				}
				    }
//------------------3rd----------------------------
				
				for(int i=1;i<=n;i++) 
				{
					if(i%2!=0) 
					{
						for(int j=1;j<=i;j++) 
						{
							System.out.print("*");
						}
						System.out.println("");
					}			
				}
	//----------------4th------------------------
				for(int i=0;i<=n;i++) 
				{
					for(int sp=0;sp<=i;sp++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=n-i;j++) 
					{
						System.out.print("* ");
					}
					System.out.println("");
				}
//-----------------------5th---------------------	
				int h;
				h=(n+1)/2;
				int n1=1;
				for(int i=1;i<=n;i++)
				{
					
					if(i<=h)
					{
						h=i;
					}
					else
					{
						h--;
					}
					for(int j=1;j<=h;j++)
					{ 
						System.out.print(2*n1+" ");
						n1++;
					}
					if(i<=h)
					{
						h=(n+1)/2;
					}
					System.out.println("");
				}
			
		
				
		}

	}
