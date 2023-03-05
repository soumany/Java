package ProjectRUPP.week7;
import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a password:  ");
    String userInput = input.nextLine();

    while(true){
      //work when lenght not equal 8
      if(userInput.length() != 8) {

        System.out.println("A password must be at least 8 characters, please try again.");
        userInput = input.nextLine();
      }
      //work when password not digits and letters
      else if(!checkValidPassword(userInput)){
        System.out.println("A password must consist of only digits and letters, please try again.");
        userInput = input.nextLine();
      }
      //work when passwork isn't uppercase
      else if(!isUpperCase(userInput)) {
        System.out.println("A password must contain at least one upper/lower letter, please try again.");
         userInput = input.nextLine();
      }
      else{
        System.out.println("A password a valid was entered!!");
        break;
      }
    }
  }


  static boolean checkValidPassword(String userInput) {

    boolean isNumber = false;
    boolean isLetter = false;
    boolean result = false;

    for(int i = 0; i < userInput.length(); i++) {
      //check digits
      if(Character.isDigit(userInput.charAt(i))){
        isNumber = true;
      }
     //check letters
      else if(Character.isLetter(userInput.charAt(i))){
        isLetter = true;
      }
      if(isNumber && isLetter) {
        result = true;
        return result;
      }
    }
    return result;
  }
  
  static boolean isUpperCase(String userInput){
    boolean isUpper = false;
    boolean isLower = false;
    boolean result = false;

    for(int i = 0; i<userInput.length(); i++){
      //check if upper
      if(Character.isUpperCase(userInput.charAt(i))){
        isUpper = true;
      }
      //check if lower
      if(Character.isLowerCase(userInput.charAt(i))){
        isLower = true;
      }
      if(isUpper && isLower) {
        result = true;
        return result;
      }
    }
    return result;
  }
}