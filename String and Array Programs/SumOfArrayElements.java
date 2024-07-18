package carrerfair_problemsolving;

 

public class SumOfArrayElements {
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        int sum = sumOfArray(array);
        System.out.println("The sum of the array elements is: " + sum);
    }
}
