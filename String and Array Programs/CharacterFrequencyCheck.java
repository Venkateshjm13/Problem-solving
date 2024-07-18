package carrerfair_problemsolving;

import java.util.Scanner;

public class CharacterFrequencyCheck {

	public static void main(String[] args) {
	  
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string:");
                String input = scanner.nextLine();
                
                int[] frequency = new int[256];
                
                
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    frequency[ch]++;
                }
                
                 
                System.out.println("Character occurrences in the string:");
                for (int i = 0; i < frequency.length; i++) {
                    if (frequency[i] > 0) {
                        System.out.println((char) i + ": " + frequency[i]);
                    }
                }
            }
        

	}


