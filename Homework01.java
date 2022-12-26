import java.util.Scanner;
/**
 * Homework01
 */
public class Homework01 {

    public static void main(String[] args) {

        //declare variables of Total and Number
        byte Total=0; 
        byte Number;

        //User Input The Value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");

        while(Total<=50){ //Checking Total is less than or equal to 50 or not

            Number = scanner.nextByte(); // user input the value of number
            Total += Number; // Total = Total + Number;
            
            System.out.println("This total is: " + Total); // output
        }
        
        scanner.close();
    }
}