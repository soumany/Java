import java.util.Scanner;
class HW3 {
    public static void main(String[] args){
        //Enter a first number
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num1 = input1.nextInt();
        int total = num1;
        System.out.print("Do you want to add another number? Y/N");

        char again = 'Y';
       // String again = input1.nextLine();

        while ( again == 'Y' ) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter another number:");
            int num2 = input2.nextInt();
            total = total + num2;
        }
        System.out.println("Your Total is" + total);
        System.out.print("Do you want to add another number? Y/N");


        



    }
  }

