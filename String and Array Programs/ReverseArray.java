package carrerfair_problemsolving;

public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];
         
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }
        
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        int[] reversed = reverseArray(array);
        
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

