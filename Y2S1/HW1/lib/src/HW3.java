import java.util.Scanner;
class HW3 {
    public static void main(String[] args){
        //User input a frist value
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num1 = input1.nextInt();
        System.out.println("Your value is " + num1);

        System.out.print("Do you want to add another number? Y/N");

         //Declare variable 
        char again = 'Y';
        //when user want to add another value
        while ( again == 'Y' ) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter another number:");
            int num2 = input2.nextInt();
            int total = num1 + num2;
            System.out.println("Your Total is" + total);
        }
        
       // System.out.print("Do you want to add another number? Y/N");


        



    }
  }

