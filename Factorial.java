import java.util.Scanner;

public class Factorial {
	

	public static int nonrecursive(int num) {
	
	
		int	sum = 1;
		
			for (int j=num;j>=1;j--) {
				
				sum = sum *j;
				
			}
			return sum;
		}
	
	public static int recursive(int num) {
		//System.out.println("Calling recursive method is for value: "+num);
		if (num==1) 
			return 1;
		
		else {
			
			return(num* recursive(num-1));
		}
		
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number to find factorial : ");
		int num = input.nextInt();
		
	
		int factorial = nonrecursive(num);
		System.out.println("Factorial for "+num+" in non-recursive method is: "+factorial);	
		

		
		
		factorial = recursive(num);
		System.out.println("Factorial for "+num+" in recursive method is: "+factorial);
	}

	}



