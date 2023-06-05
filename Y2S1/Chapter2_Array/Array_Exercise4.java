import java.util.Scanner;;

public class Array_Exercise4 {
    public static void main(String[] args) {

        // User Input Number in range of [0-999]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Value in range of [0 until 999]: ");

        int Number = scanner.nextInt();

        // Checking Number less than 0 ot bigger than 999 or not
        if (Number < 0 || Number > 999) {
            // if it is true, it will output this sentence
            System.out.println("Sorry, Your Numbers are Invalid.");
        }

        // using else if this first is not true, so we use else statement
        else {
            // declare variables
            int Last_Digit = Number % 10;
            int Digit = Number / 10;
            int Second_Digit = Digit % 10;
            int First_Digit = Number / 100;

            String[] Unit_Number = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight",
                    "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                    "sixteen", "seventeen", "eigthteen", "nineteen" };
            String[] Ten_Number = { " ", "Ten", "Twenty", "Thirdty", "fourty", "fifty", "sixty", "seventy",
                    "eighty", "ninety" };
            String Hunderd_Number = "Hundred";

            // Checking if Number less than 20
            if (Number < 20) {

                // output Unit Number
                System.out.println(Unit_Number[Number]);
            } else if (Number < 100) { // if Number less than 1000

                // output Ten Number with Unit Number
                System.out.println(Ten_Number[Second_Digit] + " " + Unit_Number[Last_Digit]);
            } else { // if both of them not true above, so we use else statement

                // output Unit Number+hundered Number+Ten Number+Unit Number
                System.out.println(Unit_Number[First_Digit] + " " + Hunderd_Number + " " + Ten_Number[Second_Digit]
                        + " " + Unit_Number[Last_Digit]);
            }
        }

        scanner.close();
    }
}
