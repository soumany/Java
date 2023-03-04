import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.nextLine();
        System.out.print("Enter the Substring: ");
        String substring = input.nextLine();
        input.close();

        System.out.println(removeSubstring(string, substring ));

    }
    public static String removeSubstring(String string, String substring){
        if (substring.isEmpty()){
            return string;
        }
        String result = string.replaceAll(substring, "");
        return result;
    }
}
