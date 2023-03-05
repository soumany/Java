import java.util.Arrays;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ask User-input
        System.out.println("Enter Your Word1: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter Your Word2: ");
        String word2 = scanner.nextLine();

        if(isAnagram(word1, word2)){
            System.out.println("Yes, They are a anagram! :)");
        }else{
            System.out.println("No, They are not a anagram! :()");
        }

        scanner.close();        
    }

    static boolean isAnagram(String word1, String word2){

        // convert both string into lowercase if one of them, user input capital letter
        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        //checking the length of both string
        if(word1.length() != word2.length()){
            return false;
        }

        //Transfrom string into characters
        char String_Word1_Array[] = word1.toCharArray();
        char String_Word2_Array[] = word2.toCharArray();

        //sorting both string
        Arrays.sort(String_Word1_Array);
        Arrays.sort(String_Word2_Array);
        
        //iterate the loop
        for(int i=0; i<word1.length(); i++){
            if(String_Word1_Array[i] != String_Word2_Array[i]){
                return false;
            }
        }

        return true;
    }
}
