package carrerfair_problemsolving;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean isRepeated = false;
            
             
            for (int j = 0; j < input.length(); j++) {
                if (i != j && ch == input.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            
             
            if (!isRepeated) {
                System.out.println("The first non-repeated character is: " + ch);
                return;
            }
        }
        
        System.out.println("There is no non-repeated character in the input string.");
    }
}
