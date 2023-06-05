
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    // user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of emirps for the program to generate: ");
    int n = input.nextInt();

    // print the number of emirps
    ArrayList<Integer> emirpsNumber = generateEmirp(n);
    for(int i = 0; i < emirpsNumber.size(); i++) {
      System.out.printf("%6d",emirpsNumber.get(i));
      if((i + 1) % 10 == 0){
        System.out.println();
      }
    }
  }
  //check isPrime
  public static boolean isPrime(int number){
    // return number == prime number 
    if (number <= 1){
      return false;
    }
    
    for(int i = 2; i <= Math.sqrt(number); i++){
      // check isPrime is prime number and  return true
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }
  //reverse
  public static int reverseNumber(int number) {
    int reverse = 0;
    while(number != 0){ 
      // check prime number and return reverse number
      reverse = reverse * 10 + number % 10;
      number /= 10;
    }
    return reverse;
  }

  public static ArrayList<Integer> generateEmirp(int n) {
    ArrayList<Integer> emirpsNumber = new ArrayList<>();
    //Start with the first emirps
    int number = 13;
    // loop through the number of emirps and generate emirps number
    while(emirpsNumber.size() < n){

      if(isPrime(number)) {
        int reverse = reverseNumber(number);
        if(number != reverse && isPrime(reverse)) {
          emirpsNumber.add(number);
        }
      }
      number++;
    }
    return emirpsNumber;
  }
}
