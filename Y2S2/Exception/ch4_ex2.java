import java.util.InputMismatchException;
import java.util.Scanner;

public class ch4_ex2 {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner scan = new Scanner(System.in);

        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer between 1 and 12: ");
            try {
                input = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scan.next(); // Clear the invalid input from the scanner buffer
            }
        }

        try {
            String month = months[input - 1];
            int days = dom[input - 1];
            System.out.println("Month: " + month);
            System.out.println("Number of days: " + days);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
        }
    }
}