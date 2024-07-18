package carrerfair_problemsolving;

import java.util.Arrays;

public class MinimumMaximumOfArray {
	
	  public static void main(String[] args) {
		  
		        int[] array = {3, 5, 1, 8, -2, 7, 10};
		        int[] result = findMinMax(array);
		        System.out.println("Minimum element: " + result[0]);
		        System.out.println("Maximum element: " + result[1]);
		    }
	  
	  public static int[] findMinMax(int[] array) {
	        int min = array[0];
	        int max = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
 
	        }
			 return new int[]{min, max};
	    }
	  
   
   
}
