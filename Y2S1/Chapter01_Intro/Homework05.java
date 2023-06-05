import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        //declare variable
        int n;

        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        // user input value of n
        n = scanner.nextInt();

        //Using formula of mathematic to compute n^3
        int nCube = (int)(Math.pow(n,3));

        //checking if n less than 11000 or not
        if(n < 11000){
            System.out.println("The highest integer below 11000 is: " + nCube); // output
        }
        else{
            System.out.println("Invalid."); // output
        }

        scanner.close();
    }
}
