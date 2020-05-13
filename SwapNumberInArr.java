package arraysPractice;
/*Write a program to locate and swap only 2 elements which are not sorted 
 in a given sorted array. For example given an array {1,2,5,6,4} locate 5 and 4 
 and then swap them as they are not as per sorted order.
 */


public class SwapNumberInArr {

	public static void main(String[] args) {
		 
		int arr[]= {1,2,5,6,4};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<i;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
				
			}	
		
		}
		System.out.print("Sorted array is : ");
		for(int i=0;i<arr.length;i++) {
			
			
			System.out.print( arr[i] + ",");
		}

	}

}
