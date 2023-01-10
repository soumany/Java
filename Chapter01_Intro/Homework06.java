import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        //declare variables
        byte Positive = 0, Negative = 0, Total = 0;

        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your value: ");

        // user input value of Number 
        int Number = scanner.nextShort();

        while(Number != 0){ // checking Number not equal to 0
            if(Number > 0){ // checking if number bigger than 0
                Positive++; // increase by 1 of posivtive
            }
            else{
                Negative++; // increase by 1 of negative

                Total += Number;

            }

            Total += Number;
            System.out.println("Enter the value: ");
            Number = scanner.nextShort();
        }

        System.out.println("Number of positive integer: " + Positive
        + "\nNumber of negative integer: " + Negative  
        + "\nTotal of integer: " + Total
        + "\nAverage og Total: " + (Total*1.0)/(Positive + Negative));

        scanner.close();
    }
}
