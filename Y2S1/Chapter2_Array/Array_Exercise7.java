import java.util.Scanner;

public class Array_Exercise7 {
  public static void main(String[] args) {
    int number = 0;
    long binary = 0;
    int remainder, i = 1;
    // User input
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    number = in.nextInt();
    // codition
    while (number != 0) {
      remainder = number % 2;
      number /= 2;
      binary += remainder * i;
      i *= 10;

    }
    // display the result
    System.out.println("The number above in the entered decimal equal to :  " + binary + "  of binary");
    in.close();
  }
}
