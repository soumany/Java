import java.util.Scanner;

public class Array_Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // user input
        System.out.println("Enter any sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        System.out.println("The sentence is:" + capitalizeWord);
    }
}