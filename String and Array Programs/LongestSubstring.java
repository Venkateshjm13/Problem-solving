package carrerfair_problemsolving;
 
	public class LongestSubstring {
		public static void main(String[] args) {
	        String input = "geeksforgeeks";
	        System.out.println("The input string is: " + input);
	        int length = lengthOfLongestSubstring(input);
	        System.out.println("The length of the longest substring without repeating characters is: " + length);
	    }
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        int maxLength = 0;
	        boolean[] visited = new boolean[256];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < 256; j++) {
	                visited[j] = false;
	            }
	            for (int j = i; j < n; j++) {
	                if (visited[s.charAt(j)]) {
	                    break;
	                } else {
	                    maxLength = Math.max(maxLength, j - i + 1);
	                    visited[s.charAt(j)] = true;
	                }
	            }
	        }

	        return maxLength;
	    }

	     
	}


