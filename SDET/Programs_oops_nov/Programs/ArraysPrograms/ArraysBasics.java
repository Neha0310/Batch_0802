package ArraysPrograms;

import java.util.Arrays;

public class ArraysBasics {

	 
	public static void main(String[] args) {
	 int[] arr = new int[5];//0-4
	 System.out.println(arr);//[I@52e922
	 System.out.println(Arrays.toString(arr));
	 System.out.println(arr[4]);
	 //System.out.println(arr[5]);
	 
	 arr[4]=90;
	 arr[0]=70;
	 System.out.println(Arrays.toString(arr));
	 
	 System.out.println(arr.length);
	 
	 String userArr [] = {"user1","user2","user3"};
	 System.out.println(Arrays.toString(userArr));
	 System.out.println(userArr.length);
	}

}
