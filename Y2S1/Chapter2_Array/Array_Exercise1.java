import java.util.Scanner;

public class Array_Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Enter any sentence: ");
        String[] s = sentence.split(" ");
        String shortest = s[0];
        String longest = "";

        for (String s1 : s) {
            if (s1.length() < shortest.length()) {
                shortest = s1;
            }

            if (s1.length() > longest.length()) {
                longest = s1;
            }
        }
        System.out.println("The Longest word is :" + longest);
    }
}