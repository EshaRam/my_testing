// Write a program print "fizz" if a number is divisible by 3,"buzz" if a number
//is divisible by 5, and "fizz buzz" 
//if number is divisible by both, else print the number.

public class Buzz {
	
	
	public static int fizzbuzz(int num) {
		
		if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
			
		}
		
		if(num % 3 ==0) {
			System.out.println("Fizz");
		}
		
		if(num % 5==0) {
			System.out.println("Buzz");
		}
		
		else {
			System.out.println(num);
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		
		 fizzbuzz(32);

	}

}
