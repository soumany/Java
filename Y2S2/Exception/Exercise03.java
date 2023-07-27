import java.util.Scanner;

public class Exercise03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String hexString = scanner.nextLine(); // Example hex string
        
        try {
            String binaryString = hex2Binary(hexString);
            System.out.println("Binary representation: " + binaryString);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        scanner.close();
    }
    
    public static String hex2Binary(String hexString) throws NumberFormatException {
        // Check if the input string is a valid hex string
        if (!hexString.matches("[0-9A-Fa-f]+")) {
            throw new NumberFormatException("Invalid hexadecimal string: " + hexString);
        }
        
        // Convert the hex string to binary
        String binaryString = "";
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            int decimal = Character.digit(c, 16);
            String binary = Integer.toBinaryString(decimal);
            while (binary.length() < 4) {
                binary = "0" + binary;
            }
            binaryString += binary;
        }
        
        return binaryString;
    }
}
