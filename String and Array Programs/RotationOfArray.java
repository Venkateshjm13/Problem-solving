package carrerfair_problemsolving;
 
public class RotationOfArray {
    public static void rotate(int[] array, int k) {
        int n = array.length;
        k = k % n; // In case k is greater than the length of the array
        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(array, k);
        
        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
