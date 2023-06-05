import java.util.Random;
import java.util.Scanner;

/**
 * Pratice
 */
public class Array_Exercise14 {

    public static void main(String[] args) {

        // declare elements in Array
        String[] Words = {"write", "that", "program"};
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while(true){

            // Random index of the element in array words to assign to word
            String Word = Words[random.nextInt(Words.length)];

            // Guess Word store Length of word that we random, How many size?
            char[] Guess_Word = new char[Word.length()];

            // Convert all letters into *
            for(int i=0; i<Guess_Word.length; i++){
                Guess_Word[i] = '*';
            }

            int Missing_Word = 0;
            while(!new String(Guess_Word).equals(Word)){
                System.out.print("(Guess) Enter a letter in word ");
                System.out.print(Guess_Word);
                System.out.print(" > ");

                // Ask User Input
                char Guessing = scanner.nextLine().charAt(0);

                // Checking 
                if(Word.indexOf(Guessing) == -1){
                    System.out.println(Guessing + " is not in the word.");
                    Missing_Word++;
                }
                for(int i=0; i<Word.length(); i++){
                    if(Guess_Word[i] == Guessing){
                        System.out.println(Guessing + " is already in word.");
                        break;
                    }
                }

                for(int i=0; i<Word.length(); i++){
                    if(Word.charAt(i) == Guessing){
                        Guess_Word[i] = Guessing;
                    }
                }
            }

            // Display
            System.out.println("The Word is " + Word + ". You missed " + Missing_Word + " time(s)");

            // Ask User To Play it Again or not
            System.out.println("Do you want to play it again? Please, Enter(y or n)");
            if(!scanner.nextLine().toLowerCase().equals("y")){
                break;
            }
        }

        scanner.close();
    }
}