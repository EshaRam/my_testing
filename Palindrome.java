package stringsPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word to check is its a palindrome : ");
		String s = input.next();
		
		//String s = "madam";
		
		String reverse = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reverse = reverse + s.charAt(i);
		}
		
			if(s.equalsIgnoreCase(reverse)){
	            System.out.println(s + " is a Palindrome");
	            //System.out.println(reverse);
	        }
	       else{
	           System.out.println( s + " is not a Palindrome");
	       }
			
			
		}
	}


