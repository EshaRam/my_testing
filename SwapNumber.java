
	//Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
	/*--> One Function should swap the numbers without any third new variable.
	--> Second function should swap the numbers using a third variable.*/


public class SwapNumber {
		
		public static void thirdvariable(int num1, int num2) {
		
			
			int temp = num1;
			num1 = num2;
			num2= temp;
			System.out.println("swapped numbers are "+ num1 + "," +num2);
			
		}
		
		public static void swapNumber(int num1,int num2) {
			
			num2 = num1+num2;
			num1 = num2-num1;
			num2= num2-num1;
			System.out.println("Swapped numbers are " +num1 +"," +num2);
			
			
			
		}
		
		
		public static void main(String[] args) {
			thirdvariable(22,7);
			swapNumber(20,15);
		}

	}
