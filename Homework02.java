import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        //declare variable 
        int Number = 0;

        //User input 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");

        while(Number<=5){ //checking if Number less than or equal to 5 or not

            Number = scanner.nextInt(); // user input value of Number
            
            System.out.println("The last number you entered was a: " + Number); // output

            if(Number > 5){
                System.out.println("Program Stop.");
                break;
            }

        }

        scanner.close();
    }
}
