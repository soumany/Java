import java.util.Arrays;

class Exercise4 {

  public static void main(String[] args) {
    // Declare a 2D int array with static data
    int[][] vector = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {3, 1}, {4, 1}};

    // sort the array using insertion sort
    for (int i = 1; i < vector.length; i++) {
      // Declare a temporary variable to hold the current array
      int[] temp = vector[i];
      int j = i;

      // Check if the current array's second element is less than the previous array's second element
      while (j > 0 && vector[j - 1][1] >= temp[1]) {
        // If the previous array's second element is equal to the current array's second element
        if (vector[j - 1][1] == temp[1]) {
          // Check if the previous array's first element is greater than the current array's first element
          if (vector[j - 1][0] >= temp[0]) {
            // Swap the current array and previous array
            vector[j] = vector[j - 1];
            vector[j - 1] = temp;
          }
        } else {
          // Swap the current array and previous array
          vector[j] = vector[j - 1];
          vector[j - 1] = temp;
        }
        j--;
      }
    }

    // Print the sorted array
    System.out.println("Sorted Array:");
    for (int[] arr : vector) {
      System.out.println(Arrays.toString(arr));
    }
  }
}