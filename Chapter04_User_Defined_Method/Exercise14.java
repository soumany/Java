import java.util.Random;

/*
    Name: Sophea Oudom (M5)
    Group = 7
 */

public class Exercise14 {
    public static void main(String[] args) {
      char[][] array2D= 
      {
        {'A', 'B', 'C', 'D'}, 
        {'A', 'B', 'C', 'D'}, 
        {'A', 'B', 'C', 'D'},
        {'A', 'B', 'C', 'D'}
      };

    // call the method shuffleRow()
    shuffleColumns(array2D);

    //display
    for(int i=0;i<array2D.length;i++)
      {
          for(int j=0;j<array2D[0].length;j++)
          {
              System.out.print(array2D[i][j]+" ");
          }
          System.out.println("");
      }          
    }

    public static void shuffleColumns(char[][] array2D){
      // create variable coumns to store length of array2D
      int columns = array2D.length;
      Random rand = new Random();
  
      // loop to generate the columns
      for(int i=0; i<columns; i++){
        int x = rand.nextInt(columns);
        int y = rand.nextInt(columns);
        for(int j=0; j<array2D[0].length; j++){
          char temp = array2D[j][x];
          array2D[j][x] = array2D[j][y];
          array2D[j][y] = temp;
        }
      }
    }
}
