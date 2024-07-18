package carrerfair_problemsolving;

 

public class CheckArrayContainsIndex {
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        int value = 7;
        int index = findIndex(array, value);
        System.out.println("Index of " + value + " in the array is: " + index);
    }
}
