package carrerfair_problemsolving;

public class SecondLargestElementInArray {
    public static int findSecondLargest(int[] array) {
       
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

       
        return second;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
