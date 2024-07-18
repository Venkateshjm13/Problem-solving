package carrerfair_problemsolving;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		String inputString = sc.next();
		String reversed="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			
			reversed = reversed + inputString.charAt(i);
			
		}
		
		System.out.println("The reversed String is: "+reversed);

	}

}
