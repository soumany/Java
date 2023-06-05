import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Exercise01
 */
public class Exercise01 {

  public static void main(String[] args) {

    // create a Hashmap to stored countries and capitals
    HashMap<String, String> capitalStates = new HashMap<>();

    // put the key and value in the capitalStatea
    capitalStates.put("Cambodia", "Phnom Penh");
    capitalStates.put("Thailand", "Bangkok");
    capitalStates.put("China", "Beijing");
    capitalStates.put("Japan", "Tokyo");
    capitalStates.put("India", "Delhi");
    capitalStates.put("Malaysia", "Kuala Lumpur");
    capitalStates.put("Germany", "Berlin");
    capitalStates.put("France", "Paris");
    capitalStates.put("Brazil", "Brasilia");
    capitalStates.put("Mexico", "Mexico City");

    // ask user to input
    Scanner scanner = new Scanner(System.in);

    // create a random object to generate the random numbers
    Random random = new Random();

    // create a variable to store the correct answer
    int correct = 0;

    // using loop to ask the question from 0 -> 9
    for(int i=0; i<10; i++){
      // gerneate the numbers
      int index = random.nextInt(10);

      // get the countries index from the capitalStates's key set
      String countries = (String)capitalStates.keySet().toArray()[index];

      // get the capital for the countries from the capitalStates
      String capital = capitalStates.get(countries);

      // ask user to enter the capital of countries
      System.out.println("What is the capital of " + countries + " ?");

      // get the user's answer and convert it to loercase
      String answer = scanner.nextLine().toLowerCase();

      // Check if the answer is correct by comparing it to the lower case version of the capital
      if(answer.equals(capital.toLowerCase())){

        // if it is correct, it will increase by 1
        correct++;

        // remove repeat the same question
        capitalStates.remove(countries);

        // display
        System.out.println("Your answer is correct!!!");
      }
      else{

        // if it is incorrect, it will print message and the correct answer as well
        System.out.println("Wrong, The correct answer is " + capital + ".");

        
      }
    }

    // closing the scanner object
    scanner.close();

    // display the total of correct answer
    System.out.println("You got " + correct + " out of 10.");
  }
}