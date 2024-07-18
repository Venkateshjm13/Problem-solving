package carrerfair_problemsolving;

import java.util.Scanner;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        input = input.toLowerCase();
        
        int vowelsCount = 0;
        int consonantsCount = 0;
        
      
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
             
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}

