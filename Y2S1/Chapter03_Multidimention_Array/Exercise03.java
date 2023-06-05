package ProjectRUPP.Week5;
import java.util.Scanner;


public class Exercise03 {
  public static void main(String[] args) {

    //declare array 2D
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = in.nextInt();
    int array[][] = new int[number][number];
    int k = 1;

    //work in loop
    for ( int i = number-1; i >= 0; i--){
      for ( int j = number-1; j >= i ; j--){

        array[j][i] = k;
        k++;
      }
    }

    for( int i = 0; i < number; i++){
      System.out.println();
      for( int j = 0; j <= i; j++){
        System.out.print(array[i][j]+"\t");
      }
    }
    in.close();
  }
}