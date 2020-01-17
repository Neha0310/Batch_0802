package ArraysPrograms;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		
		
		 //Step1: Create an Array and  Specified the size of an array
		//DataType varName = new (keyword) datatype[size of an array];
		//int[] arr = new int[5];
		int[] arr= {10,6,7,5,4,14,3}; 
		
//		System.out.println("Before Sorting - "+Arrays.toString(arr));
//		
//		Arrays.sort(arr); // Ascending 
//		
//	
//		System.out.println("After Sorting - "+Arrays.toString(arr));
		
		
		 //Step2: Add the elements in an array
		 //ArrayName[index_no]=value;
		 
		 int largest=0;//10//67//87
		 int index_no=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>largest) {
				 largest = arr[i];
				 index_no=i;
				 
			 } 
		 }
		 
		 ///3. to acess the Array element.
		// ArrayName[index_no];
		 
		  System.out.println(largest +" having index number is "+index_no);
		 

	}

}
