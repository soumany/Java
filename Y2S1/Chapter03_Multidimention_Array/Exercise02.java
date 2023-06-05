public class Exercise02 {
    public static void main(String[] args) {
        char [][] latters = new char[10][10] ;
        //initailize arrays 
        for ( int row = 0 ; row < latters.length ; row++ )
        {
            for ( int column = 0 ; column < latters[row].length ; column++ )
            {
                int number = (int)( Math.random() * 26 ) + 65  ; // char value bitween 65 - 90 are latter A -> Z
                latters[row][column] = (char) number ; // convert int value to char
                System.out.printf("  " + latters[row][column]); // display
            }     
            System.out.println();     
        }

        System.out.print("   Right up using pointers \n");

        for ( int row = 0 ; row < latters.length ; row++ )
        {
            int column1 = 0 ;
            int row1 = row ;
            for ( int column = row ; column >= 0 ; column-- )
            {              
                System.out.print(" " + latters[row1][column1]);
                row1 -- ;
                column1 ++ ;
            }
             System.out.println();
        }
        for ( int row = latters.length - 1 ; row >= 0 ; row-- )
        {
            int row1 = latters.length -1 ;
            int column1 = latters.length - row ;
            
            for ( int column = 0 ; column < row ; column++ )
            {                               
                System.out.print(" " + latters[row1][column1]);
                row1 -- ;
                column1 ++ ;               
            }           
             System.out.println();
        }
    }

}