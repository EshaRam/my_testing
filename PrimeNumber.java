

//Write a program  to check if a given number is prime or not.
public class PrimeNumber {

	public static boolean primeNumber(int num) {
		boolean prime =true;

			if(num <= 1) {
				prime = false;
				return prime;
			}
			

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
			return prime;
		
	}
	

}
