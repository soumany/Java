package ProjectRUPP.week08;

public class Exercise15 {
  public static void main(String[] args) {
      //declearing the multiple array2D
      int[][] array2D = {
          {0, 2, 0, 3, 1, 6, 1},
          {0, 2, 6, 8, 6, 0, 1},
          {1, 0, 2, 1, 8, 1, 9},
          {1, 7, 0, 1, 2, 9, 1},
          {9, 3, 6, 0, 4, 0, 7},
          {1, 3, 3, 3, 4, 0, 7}
      };
    
      System.out.println(isConsecutiveFour(array2D));
  }
    
  public static boolean isConsecutiveFour(int[][] array2D){
       
        // //Going through the array horizontally
        for (int rows= 0; rows< array2D.length; rows++) {
          //looking at the first rows of the array
          int start = array2D[rows][0];
          int count = 1;
          // look at the last rows of the array and count the number of rows
          for (int colunms = 1; colunms < array2D[rows].length; colunms++) {
            if (start == array2D[rows][colunms]) {
              count++;
            } else {
              start = array2D[rows][colunms];
              count = 1;
            }
            if (count == 4) {
              System.out.println("This is an array consists of four consecutive number horizontally!");
            return true;
            }
          }
        }
         //Going through the array vertically and looking for the first element in each array
         for (int columns = 0; columns <array2D[0].length; columns++) {
          //looking at the first column of the array
            int start = array2D[0][columns];
            int count = 1;
            for (int rows = 1; rows <array2D.length; rows++) {
              //loop through each row and column in the array and count the number of rows in the array
              if (start == array2D[rows][columns]) {
  
                count++;
              } else {
                start = array2D[rows][columns];
                count = 1;
              }
          
              if (count == 4) {
                System.out.println("This is an array consists of four consecutive number vertically");
                return true;
              }
            }
          }
        // From upper right to lower left
       // Go through the row
        for (int i = 0; i < array2D.length; i++) {
          // Go through the column and column index and increment
          int start = array2D[i][array2D[i].length-1];
          int count = 1;
          for (int j = i+1, k = array2D[0].length-2; j < array2D.length && k >= 0; j++, k--) {
            // loop over the array  and count the number of elements in the array 
            if (start == array2D[j][k]) {
              count++;
            } else {
              start = array2D[j][k];
              count = 1;
            }
            if (count == 4) {
              System.out.println("This is an array consists of four consecutive number upper right to lower left of diagonally!");
             return true;
            }
          }
        }
    
        // From upper left to lower right
        // Go through the row
      for (int i = 0; i < array2D.length; i++) {
          int start = array2D[i][0];
          int count = 1;
          for (int j = i+1, k = 1; j < array2D.length && k < array2D[0].length; j++, k++) {
            if (start == array2D[j][k]) {
                count++;
            } 
            else {
                start = array2D[j][k];
                count = 1;
            }
          if (count == 4) {
              System.out.println("This is an array consists of four consecutive number from upper left to lower right of diagonally!");
              return true;
          }
        }
      }
    return false;
  }
}