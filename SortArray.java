package arraysPractice;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {23,12,45,90,8,65};
		
		System.out.println("Array to be sorted  is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i] + ", " );
		}
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if( arr[i]>arr[j]) {
					
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				
				}	
				
			}
		}
		System.out.println();
		
		System.out.println("sorted arrray is: ");
		 for(int i=0;i<arr.length;i++) {
			 
			 
				System.out.print( arr[i] + ", " );
		}
		
		

}
}
