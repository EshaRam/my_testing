package stringsPractice;

//Write a program to reverse each individual word in a sentence.
public class ReverseWords {

	public static void main(String[] args) {
		String s = "Have a good day!";
		
		String reverse = "";
		
		//String [] words = s.split(" ");
		
		for (int i=s.length()-1;i>=0;i--) {
			
			reverse = reverse + s.charAt(i);
		}
		System.out.println("The sentence to be reversed is: "+ s);
		System.out.println("Reversed sentence is: "+ reverse);
	}

}
