import java.util.Scanner;

public class Exercise02 {
public static void main(String[] args) 
    {
    int num, isPalin, s;
    //user input 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any number ");

    num = input.nextInt();
    isPalin = num;
    s = generatePalindromicPalin(num);
    //check loop that if both are equal then it prints given number is a palindrome.
        if(s==isPalin)
    System.out.println(isPalin+" is a palindrome number ");
        else
    System.out.println(isPalin+" is not a palindrome number ");                  
}

    static int generatePalindromicPalin(int number) {
        int sum = 0, realNumber;
        while (number != 0) {
            realNumber = number % 10;
            sum = (sum * 10) + realNumber;
            number /= 10;
        }
        return sum;
    }
}
