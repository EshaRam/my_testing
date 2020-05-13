package arraysPractice;


/*Write a program to perform a linear search on any given array.
  Linear search is the basic search where you look for the element 
  to be searched in a sequential way.
 */

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		String arr[] = {"Red", "blue","Green","Yellow","Black","Pink"};
				
		//System.out.print("The list of colors are :" + arr);
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the color to check : ");
			String color = input.next();
			boolean flag = false;
			for (int i=0;i<arr.length;i++) {
				
//			System.out.println("arr of ["+i+"] is " + arr[i] + " and color is :"+color);
				if(color.compareToIgnoreCase(arr[i])==0) {	
				   flag = true;
				   break;
				}
				
			}// end loop
			
			if (flag == true)
			  System.out.println(color + " is present in the array");
			else 
			  System.out.println(color + " is not present in the array");
		}
		}
		
	}


