package carrerfair_problemsolving;

import java.util.Scanner;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();
        
        char[] chars = input.toCharArray();
        int length = chars.length;
        
        char[] result= new char[length];
        int index = 0;
        
        
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < index; j++) {
                if (chars[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
             
            if (!isDuplicate) {
                result[index++] = chars[i];
            }
        }
        
         
        String uniqueString ="";
        for (int i = 0; i < index; i++) {
            uniqueString += result[i];
        }
//        
        System.out.println("String after removing duplicates: " + uniqueString);
    }
}


