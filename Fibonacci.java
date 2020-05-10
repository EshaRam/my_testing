
public class Fibonacci {

	//Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
	//You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or
	//any desired number.
	
	
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i=0;i<15;i++) {
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
			System.out.println( num3);
					
		}
		
	}

}
