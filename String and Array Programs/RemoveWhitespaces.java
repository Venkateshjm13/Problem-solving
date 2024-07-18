package carrerfair_problemsolving;

import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String result = input.replaceAll("\\s", "");
        
        System.out.println("String after removing all whitespaces: " + result);
    }
}

