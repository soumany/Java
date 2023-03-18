import java.util.Random;

/*
  Name: Sophea Oudom (M5)
  Group: 7
 */

public class Exercise13 {
    public static void main(String[] args) {
        char[][] array2D= {
            {'A', 'A', 'A', 'A'}, 
            {'B', 'B', 'B', 'B'},
            {'C', 'C', 'C', 'C'}, 
            {'D', 'D', 'D', 'D'}  
        };
      
        // calling the method shuffleRow()
        shuffleRow(array2D);

        // display
        for(int i=0;i<array2D.length;i++)
        {
            for(int j=0;j<array2D[0].length;j++)
            {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println("");
        }          
    }

    public static void shuffleRow(char[][] array2D){

        // create variable row to store length of array2D
        int row = array2D.length;
        Random rand = new Random();

        // use loop to generate the row
        for(int i=0; i<row; i++){
          int x = rand.nextInt(row);
          int y = rand.nextInt(row);
    
          for(int j=0; j<array2D[0].length; j++){
            char temp = array2D[x][j];
            array2D[x][j] = array2D[y][j];
            array2D[y][j] = temp;
          }
        }
      }
}
