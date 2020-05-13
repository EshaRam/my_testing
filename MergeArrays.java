package arraysPractice;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int arr1[]= {2,4,7,9,10};
		int arr2[]= {4,3,6,8,11};
		
		int fal = arr1.length;
		int sal = arr2.length;
		
	int[]	merge = new int[fal + sal];
	
	System.arraycopy(arr1, 0, merge, 0, fal);  
	System.arraycopy(arr2, 0, merge, fal, sal); 
	System.out.print(Arrays.toString(merge));

	}

}
