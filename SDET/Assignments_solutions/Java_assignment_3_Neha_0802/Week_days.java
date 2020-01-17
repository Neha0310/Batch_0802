//Program to enter the days of week and print name of day
import java.util.Scanner;
			public class Week_days {
			
					public static void main(String[] args)
					{
						Scanner s=new Scanner(System.in);
						System.out.println("Enter a number");
						int n=s.nextInt();
						switch(n) {
						case 1:
							System.out.println("Monday");
							break;
						case 2:
							System.out.println("Tuesday");
							break;
						case 3:
							System.out.println("wednesday");
							break;
						case 4:
							System.out.println("Thursday");
							break;
						case 5:
							System.out.println("Friday");
							break;
						case 6:
							System.out.println("Saturday");
							break;
						case 7:
							System.out.println("Sunday");
							break;
						}
				
					}
				}
