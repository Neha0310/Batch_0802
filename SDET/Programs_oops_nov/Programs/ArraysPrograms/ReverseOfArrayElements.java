package ArraysPrograms;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseOfArrayElements {

	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements into array");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=s.nextInt();
		} 
		
		System.out.println(Arrays.toString(arr));
		int[] arr2=new int[5];
		int i=0;
		int rem;
		int rev=0;
		for(i=0;i<arr2.length;i++) {
			//for(int j=1;arr[i]>0;j++) {
			while(arr[i]>0) {
			rem=arr[i]%10;//123%10=3/12%10=2
			rev=rev*10+rem;//0+3=3//3*10+2=32
			arr[i]=arr[i]/10;//123/10=12/10=1/10=0
			
		}arr2[i]=rev;
			rev=0;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
