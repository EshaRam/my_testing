
//Write a program  that accepts input from the command line and then prints them.
import java.util.Scanner;
public class CommandLine {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your name : ");
			
			String name = input.next();
			
			
			System.out.println("Welcome "+ name);
		}
		
	}

}
