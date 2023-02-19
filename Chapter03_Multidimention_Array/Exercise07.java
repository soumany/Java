import java.util.Random;
import java.util.Scanner;

public class Exercise07{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // declare variable
        int Guessing_Captial_State;
        int Correct_Count = 0;

        // declare 2D array to store countries and capital state
        String[][] Capital_State = {
                   {"Camboida","Phnom Penh"},
                   {"Thailand","Bangkok"},
                   {"China","Beijing"},
                   {"Japan","Tokyo"},
                   {"India","Delhi"},
                   {"Malaysia","Kuala Lumpur"},
                   {"Australia","Canberra"},
                   {"Belgium","Brussels"},
                   {"Morocco","Rabat"},
                   {"Brazil","Brasilia"},
        };

        // using for loop to check if user input capital state name right or wrong
        for(int i=0; i<Capital_State.length; i++){
            Guessing_Captial_State = rand.nextInt(i, 10);
            
            // output the question
            System.out.println("What is the capital of " + Capital_State[Guessing_Captial_State][0] + "?"); 

            // Ask User-input capital state name capital letter or small letter 
            // use nextLine() instead of next() because user will input capital-state with space
            if(scanner.nextLine().equalsIgnoreCase(Capital_State[Guessing_Captial_State][1])){
                System.out.println("[Bravo] Your anser is correct. :)");

                // it will increase if user input right answer
                Correct_Count++;
            }

            // if user-input wrong answer, it will output this
            else{
                System.out.println("[Sorry] :( The correct answer should be " + Capital_State[Guessing_Captial_State][1]);
            }

            // Avoid repeat question again
            Capital_State[Guessing_Captial_State][0] = Capital_State[i][0];
            Capital_State[Guessing_Captial_State][1] = Capital_State[i][1];
        }
 
        // Display
        System.out.println("The Correct Count is: " + Correct_Count);
        scanner.close();
    }
}
