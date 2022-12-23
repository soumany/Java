import java.util.Scanner;
class HW2 {
    public static void main (String[] args){
int num = 0;
while ( num <= 5 ) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number = input.nextInt();
    num = number;
}
System.out.println("The last number you enteres was a " + num);
    }
}
