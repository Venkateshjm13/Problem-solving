package carrerfair_problemsolving;
 
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10, 5, 3, 8};
        int[] result = removeDuplicates(array);
        
        System.out.print("Array with duplicates removed: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

