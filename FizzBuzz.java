import java.util.Scanner;

//Write a program print "fizz" if a number is divisible by 3,"buzz" if a number is divisible by 5,
//and "fizz buzz" if number is divisible by both, else print the number.

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();
			 	
				if(num % 3==0 && num % 5==0) {
				System.out.print("FizzBuzz");
				System.exit(0);
			}				
			if( num % 3 ==0) {
				System.out.print("Fizz");
				System.exit(0);
				}				
			if(num % 5==0) {
				System.out.print("Buzz");
			}		
			else {
				
			System.out.print(num);
				 		
			}
		}
		}
}
	


