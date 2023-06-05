import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask USer-input
        System.out.println("Enter Your word: ");
        String sentence = scanner.nextLine();

        //display
        System.out.println("The Output is: " + sort(sentence));

        scanner.close();
    }

    public static String sort(String sentence){

        //Remove other things that it is not a alphabet
        String temp = " ";
        for(int i=0; i<sentence.length(); i++){
            if(Character.isLetter(sentence.charAt(i)) || sentence.charAt(i) == ' '){
                temp += sentence.charAt(i);
            }
        }

        // remove space between a string
        sentence = temp.trim();

        //Convert a string to lowercase if the user input capital letters
        char[] character = sentence.toLowerCase().toCharArray();

        //sorting
        Arrays.sort(character);

        //created new sorted to return
        String sorted = new String(character);
        return sorted;

    }
}
