package carrerfair_problemsolving;

 

public class AverageOfArrayElements {
    public static double averageOfArray(int[] array) {
        int sum = 0;
        double avg =0;
         
        for (int num : array) {
            sum += num;
        }
        
        avg = sum / array.length;
        
        return avg;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 10};
        double average = averageOfArray(array);
        System.out.println("The average of the array elements is: " + average);
    }
}
