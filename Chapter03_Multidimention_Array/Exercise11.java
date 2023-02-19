import java.util.Random;
import java.util.Scanner;
/**
 * Exercise11
 */
public class Exercise11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Our Quiz Today! Please, Enter Your Answer For Each Questions Below: ");

        // Generate Random Numbers
        Random rand = new Random();

        // Delcare Array x, y, and question
        int[] x = new int[5];
        int[] y = new int[5];
        int[] Question = new int[5];

        for(int i=0; i<5; i++){
            x[i] = rand.nextInt(20) + 1;
            y[i] = rand.nextInt(20) + 1;
        }

        Question[0] = x[0] + y[0];
        Question[1] = x[1] - y[1];
        Question[2] = x[2] / y[2];
        Question[3] = x[3] * y[3];
        Question[4] = x[4] + y[4];

        // Declare Variables
        int Correct_Answer = 0;
        int count = 5;

        // Checking
        System.out.print(" Question 1: What is " + x[0] + " + " + y[0] + " ? (Enter Your Answer): ");
        int Sum = scanner.nextInt();
        if(Sum == x[0] + y[0]){
            Correct_Answer++;
        }
        else{
            System.out.print(" ");
        }

        System.out.print(" Question 2: What is " + x[1] + " - " +y[1] + " ? (Enter Your Answer): ");
        int Minus = scanner.nextInt();
        if(Minus == x[1] - y[1]){
            Correct_Answer++;
        }
        else{
            System.out.print(" ");
        }

        System.out.print(" Question 3: What is " + x[2] + " / " + y[2] + " ? (Enter Your Answer): ");
        int Divide = scanner.nextInt();
        if(Divide == x[2] / y[2]){
            Correct_Answer++;
        }
        else{
            System.out.print(" ");
        }

        System.out.print(" Question 4: What is " + x[3] + " * " + y[3] + " ? (Enter Your Answer): ");
        int Multiple = scanner.nextInt();
        if(Multiple == x[3] * y[3]){
            Correct_Answer++;
        }
        else{
            System.out.print(" ");
        }
        
        System.out.print(" Question 5: What is " + x[4] + " + " + y[4] + " ? (Enter Your Answer): ");
        int Sum1 = scanner.nextInt();
        if(Sum1 == x[4] + y[4]){
            Correct_Answer++;
        }
        else{
            System.out.print(" ");
        }


        //Display the result when we answer 5 question already
        System.out.println();
        System.out.println("You got " + Correct_Answer + " correct answers out of " + count + " . The detail is below: ");
        
        System.out.print("Question 1: What is " + x[0] + " + " + y[0] + " = " + Sum);
        if(Sum == x[0] + y[0]){
            System.out.println("\tCorrect :)");
        }
        else{
            System.out.println("\tWrong! :( This correct answer is : " + Question[0]);
        }

        System.out.print("Question 2: What is " + x[1] + " - " + y[1] + " = " + Minus);
        if(Minus == x[1] - y[1]){
            System.out.println("\tCorrect :)");
        }
        else{
            System.out.println("\tWrong! :( This correct answer is: " + Question[1]);
        }

        System.out.print("Question 3: What is " + x[2] + " / " + y[2] + " = " + Divide);
        if(Divide == x[2] / y[2]){
            System.out.println("\tCorrect ;)");
        }
        else{
            System.out.println("\tWrong! :( This correct answer is: " + Question[2]);
        }

        System.out.print("Question 4: What is " + x[3] + " * " + y[3] + " = " + Multiple);
        if(Multiple == x[3] * y[3]){
            System.out.println("\tCorrect :)");
        }
        else{
            System.out.println("\tWrong! :( This correct answer is: " + Question[3]);
        }

        System.out.print("Question 5: What is " + x[4] + " = " + y[4] + " = " + Sum1);
        if(Sum1 == x[4] + y[4]){
            System.out.println("\tCorrect :)");
        }
        else{
            System.out.println("\tWrong! :( This correct answer is: " + Question[4]);
        }

        scanner.close();
    }
}