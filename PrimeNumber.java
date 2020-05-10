import java.util.Scanner;

//Write a program  to check if a given number is prime or not.
public class PrimeNumber {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number to check if it's prime : ");
			int num = input.nextInt();
			
			boolean prime = true;
			
			for (int i=2;i<num;i++) {
				if (num % i== 0) {
					prime = false;
					break;
				}
			}
				if (prime) {
					System.out.println("number is prime");
				}
				else {
					System.out.println("number is not prime");
					
				}
		}
		

	}

}
