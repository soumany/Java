package ProjectRUPP.Week5;

public class Exercise08 {
  public static void main(String[] args) {
    
    int[][] Employee_Hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},
    };
    int[][] Sum_Hours = new int[8][7];

    //Uing loop to sum Sum_Hours with Employee_Hours.
    for (int row = 0; row < Employee_Hours.length; row++) {
      for (int colunm = 0; colunm < Employee_Hours[row].length; colunm++) {
        Sum_Hours[row][0] += Employee_Hours[row][colunm];
      }
      Sum_Hours[row][1] = row;
    }

    //Condition for sorting employee overtime from max to min.
    for (int i = 0; i < Sum_Hours.length; i++){
      for(int j = i + 1; j < Sum_Hours.length; j++ ){
        if(Sum_Hours[i][0] < Sum_Hours[j][0]){
          int temp = Sum_Hours[i][0];
          Sum_Hours[i][0] = Sum_Hours[j][0];
          Sum_Hours[j][0] = temp;
        }
      }
    }

    //Display the results.
    for(int i = 0; i < Sum_Hours.length; i++){
      System.out.print("Employee number: " + Sum_Hours[i][1] + "'s total hours fo the week were:  ");
      System.out.print(Sum_Hours[i][0] + "\n");
    }
  }
}