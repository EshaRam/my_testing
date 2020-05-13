package stringsPractice;

import java.util.Scanner;

//Write a program to reverse a string.
//Do not use StringBuffer/StringBuilder inbuilt reverse function.

public class ReverseString {

	public static void main(String[] args) {
		
		String reverse = "";
		
		 try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the string to be reversed : ");
			String s = input.next();
			
			for(int i=s.length()-1;i>=0;i--) {
				
				reverse = reverse + s.charAt(i) ;
			}
		} 
			
		System.out.println(reverse);
	}

}
