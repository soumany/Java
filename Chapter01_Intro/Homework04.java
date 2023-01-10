import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        //declare variables
        int Computer_Number = 50;
        int User_Number;

        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Value: ");
        User_Number = scanner.nextInt();

        //checking Arguments in if-else statements
        if(User_Number > Computer_Number){ // if user_Number bigger than Computer_Number or not
            System.out.println(User_Number + " it is too high."); // output
        }
        else if(User_Number < Computer_Number){// if user_Number smaller than Computer_Number or not
            System.out.println(User_Number + " it is too low");// output
        }
        else if(User_Number == Computer_Number){// if user_Number equalr than Computer_Number or not
            System.out.println("Well done you took " + User_Number + " attempts.");//output
        }
        else{ 
            System.out.println("Invalid Values.");//output
        }

        scanner.close();
    }
}
