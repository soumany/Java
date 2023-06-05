/**
 * MutidimensionalEx05
 */
public class Exercise05 {

    public static void main(String[] args) {
        // declare 2D Array that have size 3 by 3
        double[][] First_Matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] Second_Matrix = {{0,2,4}, {1,4.5,2.2}, {1.1,4.3,5.2}};

        // declare variables i and j
        int i,j;

        // Display row and columns of first matrix
        System.out.print("Enter matrix1: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(First_Matrix[i][j] + " ");
            }
        }

        // Display row and columns of second matrix
        System.out.println();
        System.out.print("Enter matrix2: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(Second_Matrix[i][j] + " ");
            }
        }

        // Display The Result of sum 2 Array
        System.out.println();
        System.out.println("The matrices are added as follows:"); 
        for (i = 0; i < 3; i++) { 
            for (j = 0; j < 3; j++) { 
                System.out.printf("%-3.1f ",First_Matrix[i][j]); 
            } 
            if (i == 1) { 
                System.out.print("   +   "); 
            } 
            else System.out.print("       "); 
            for (j = 0; j < 3; j++) { 
                System.out.printf("%-3.1f ",Second_Matrix[i][j]); 
            } 
            if (i == 1) { 
                System.out.print("   =   "); 
            } 
            else System.out.print("       "); 
            for (j = 0; j < 3; j++) { 
                System.out.printf("%-3.1f ",(First_Matrix[i][j] + Second_Matrix[i][j])); 
            } 
            System.out.println(); 
        }
    }
}