import java.util.Scanner;

public class MeetTargetDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean res = false;
		int targetNum = 50;
		int i;
		for( i=1;i<=10;i++) {
			System.out.println("Please enter"+ i +"number");
			int n = scn.nextInt();
			if(targetNum==n) {
				res=true;
				break;
			}  
		}
		
		 System.out.println("Value of i is"+i);
		 
		 if(i==11) {
			 System.out.println("Better Luck next Time!!");
		 }else {
			 System.out.println("Yeah!! Achive target");
		 }
		 
//		if(res) {
//			System.out.println("Yeah!! Achive target");
//		}else {
//			System.out.println("Better Luck next Time!!");
//		}

	}

}
