package stringsPractice;

//Write a program to find a substring in a given string and then replace 
//it with another string.

public class Substring {

	public static void main(String[] args) {
		
		String s = "impossible";
		
		System.out.println(s.substring(0));
		//System.out.println(s.substring(2));
		
	//	String s1 = "is ";
		
		String replaceString = s.replaceFirst("im","is-");
		System.out.println(replaceString);
	

}
}