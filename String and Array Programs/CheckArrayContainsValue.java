package carrerfair_problemsolving;

 

public class CheckArrayContainsValue {
	
    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        int value = 8;
        boolean result = containsValue(array, value);
        System.out.println("Does the array contain " + value + "? " + result);
    }
}
