import java.util.Scanner;

class Array_Exercise11 {
    public static void main(String[] args) {
        // ask user to input a hex code and preserve it as String
        Scanner input = new Scanner(System.in);
        System.out.print("Input the HEX number: ");
        String hexNum = input.nextLine();
        System.out.println("The hex number you entered is: " + hexNum);
        int value = 0;
        int decimal = 0;
        // Loop through the String
        for (int i = 0; i < hexNum.length(); i++) {
            // every character in the hex code in c varaible
            char c = hexNum.charAt(i);
            switch (c) {
                case '0':
                    value = 0;
                    break;
                case '1':
                    value = 1;
                    break;
                case '2':
                    value = 2;
                    break;
                case '3':
                    value = 3;
                    break;
                case '4':
                    value = 4;
                    break;
                case '5':
                    value = 5;
                    break;
                case '6':
                    value = 6;
                    break;
                case '7':
                    value = 7;
                    break;
                case '8':
                    value = 8;
                    break;
                case '9':
                    value = 9;
                    break;
                case 'A':
                case 'a':
                    value = 10;
                    break;
                case 'B':
                case 'b':
                    value = 11;
                    break;
                case 'C':
                case 'c':
                    value = 12;
                    break;
                case 'D':
                case 'd':
                    value = 13;
                    break;
                case 'E':
                case 'e':
                    value = 14;
                    break;
                case 'F':
                case 'f':
                    value = 15;
                    break;
                default:
                    System.out.println("Some Character in HEX number is invalid check again :)");
            }
            decimal += value * Math.pow(16, hexNum.length() - i - 1); // mean ey thaa decimal +=  16 ^ n
        }
        System.out.println("Answer: " + hexNum + " = " + decimal);
    }

}