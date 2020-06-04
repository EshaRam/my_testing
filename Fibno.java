/* Write a program that prints a fibonacci series that is a sequence of numbers
   like0 1 1 2 3 5 8.You can vary the number of elements to be printed
    meaning you can print 10 numbers or 15 or 20 or any desired number.
 */
public class Fibno {

	static void fibonacci() {
		int a = 0;
		int c;
		int b = 1;
		for (int i = 0; i <= 15; i++) {

			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}

	}

	public static void main(String[] args) {

		fibonacci();

	}

}
