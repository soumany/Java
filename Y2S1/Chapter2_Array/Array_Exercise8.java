import java.util.Scanner;

public class Array_Exercise8 {
  public static void main(String[] args) {
    // input
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a binary to convert decimal: ");
    int number = in.nextInt();

    int decimal = 0;
    int i = 0;
    // condition
    while (number != 0) {
      int remainder = number % 10;
      number = number / 10;
      decimal = decimal + remainder * (int) Math.pow(2, i++);
    }
    // display the result
    System.out.println("The number above in the entered binary's equal to :  " + decimal + " in decimal");
    in.close();
  }
}
