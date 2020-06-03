

public class Factorial {
	

	public static int nonrecursive(int num) {
	
	
		int	sum = 1;
		
			for (int j=num;j>=1;j--) {
				
				sum = sum *j;
					
			}
			return sum;
			
		}
	
	public static int recursive(int num) {
		
		if (num==1) 
			return 1;
		
		else {
			
			return(num* recursive(num-1));
		}
		
	}
	public static void main(String[] args) {
		
		
	
		int factorial = nonrecursive(5);
		
		System.out.println("Factorial in non-recursive method is: " + factorial);	
		
		factorial = recursive(6);
		System.out.println("Factorial in recursive method is: "+factorial);
	}

	}



