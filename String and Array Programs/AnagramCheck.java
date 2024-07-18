package carrerfair_problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First string to check if it is a Anagram ");
        String str1 = scanner.next();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a Second string to check if it is a Anagram");
        String str2 = scanner2.next();

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)) {
        	System.out.println("Given strings are Anagram");
        }else {
        	System.out.println("Given strings are NOT Anagram");
        }
	}

}
