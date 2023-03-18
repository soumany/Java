
import java.util.Arrays;

public class Exercise12 {
    public static int secondLargest(int[][] array2D) {
        // Initialize the value
        int largest = array2D[0][0];
        int secondLargest = array2D[0][0];
        // Loop through row of the 2D array
        for (int i = 0; i < array2D.length; i++) {
            int[] row = array2D[i];
            // Loop through column of the 2D array
            for (int j = 0; j < row.length; j++) {
                int num = row[j];
                // Switch the largest and second largest value
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] arg) {
        int[][] arr2D = { { 1, 5, 9 }, { 3, 8, 43 }, { 20, 2, 64, 10 } };
        // Called the Method to print second largest value
        int result = secondLargest(arr2D);
        System.out.print("We have : ");
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("The second largest in this 2D array is " + result);
    }
}