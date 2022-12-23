import java.util.Scanner;
class HW1 {
    public static void main(String[] args) {
int total = 0;
while ( total <= 50 ) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer:");
  int number = input.nextInt();
  total +=number;
  System.out.println("The total is " + total);
    }
  }
}
