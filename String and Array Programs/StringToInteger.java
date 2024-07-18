package carrerfair_problemsolving;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of digits:");
        String input = scanner.next();
        
         int result = Integer.parseInt(input);
         System.out.println("Converted integer: " + result);
       
    }
}
