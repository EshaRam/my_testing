package arraysPractice;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		 int arr[]= {25,18,60,8,45,21,38};
		 
		// Arrays.sort(arr);
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
				 int temp = arr[i];
				 arr[i]= arr[j];
				 arr[j]= temp;	 
			}
			 
		 }
		 }
		  for(int i=0;i<arr.length;i++) {
			  	  
		 }
		  System.out.println("The largest number in the given array is: " + arr[arr.length-1]);  
	}

}
