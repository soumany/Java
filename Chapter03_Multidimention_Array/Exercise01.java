import java.util.UUID;

public class Exercise01 {

  public static void main(String[] args) {
    char [][] latters = new char[10][10] ;

    //initailize arrays 
    for ( int row = 0 ; row < latters.length ; row++ )
    {
        for ( int column = 0 ; column < latters[row].length ; column++ )
        {
            // char value bitween 65 - 90 are latter A -> Z
          int number = (int)( Math.random() * 26 ) + 65 ;
           // convert int value to char
            latters[row][column] = (char) number ; 
            // display
            System.out.printf("  " + latters[row][column]); 
        }     
        System.out.println(); 

    }

  }

}
