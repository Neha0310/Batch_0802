package ArraysPrograms;
import java.util.*; 

public class StoreValuesInArray {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Please enter the Size of an array");
		 int size = scn.nextInt();//10
		 
		 // Creating an array
		 
		 int[] arr = new int[size];
		// System.out.println(arr);
		 //System.out.println(Arrays.toString(arr));//[0,0,0,0,0]
		 
		 System.out.println("Insert the Array elements into Array");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Please enter "+i+" element");
			 arr[i]=scn.nextInt();
		 }
		 
		System.out.println("==================");
		System.out.println("Dispalying all the array elements of an array ");
		System.out.println(Arrays.toString(arr));//
		 
		 
		 
		 System.out.println("==================");
		System.out.println("To diosplay all array elements using loop");
		  for(int i=0;i<arr.length;i++) {
			  System.out.println(arr[i]);
		  }
		  
		  
		  System.out.println("==================");
		  System.out.println("To display all array elements in reverse order");
		  //5--(0-4)
		  for(int i =(arr.length)-1;i>=0;i--) {
			  System.out.println(arr[i]);
		  }
			
		 

	}

}
