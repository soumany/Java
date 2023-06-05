import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        //declare variables
        int Total = 0;
        int Number;

        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Value: ");

        Number = scanner.nextInt();
        Total += Number; // Total = Total + Number

        System.out.println("Press y to add another number: ");
        char choose = scanner.next().charAt(0);

        //checking choose equal to y or not
        if(choose == 'y'){

            //output
            System.out.println("Please Enter Value of Number1: ");

            // user input value of Number1
            int Number1 = scanner.nextInt();

            Total += Number1; // Total = Total + number
            System.out.println("Total: " + Total); // output
            
            //checking choose not equal to y or not
            while(choose != 'y'){
                
                // if the choose not equal to y, so it will stop the program
                break;
            }
        }

        scanner.close();
    }
}
