package arraysPractice;

//Write a program to find the common number in any given two arrays.
public class CommonNumber {

	public static void main(String[] args) {
		int num1[] = {24,35,18,20,12,90};
		int num2[] = {13,38,21,11,90,43};
		
		for (int i=0;i<num1.length;i++) {
			
			for (int j=0;j<num2.length;j++) {
				
				if(num1[i]==num2[j])
				{
					System.out.println(num1[i] + " is in both arrarys");
				}
			}
				}
			}
		}
		

