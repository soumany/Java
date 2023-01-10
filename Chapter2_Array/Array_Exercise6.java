import java.util.*;

public class Array_Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hexadecimal number:");
        String hexa = input.nextLine();
        int count = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char ch = hexa.charAt(i);

            if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')) {
                count++;
            }
        }

        if (count == hexa.length()) {
            System.out.print("Hexadicimal");
        } else {
            System.out.print("Not Hexadicimal");
        }

        input.close();
    }
}