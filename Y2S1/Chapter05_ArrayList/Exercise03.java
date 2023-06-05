
import java.util.ArrayList;
import java.util.Scanner;

/*
    Name: Sophea Oudom
    Class: M5
 */

/**
 * Arraylist03
 */
public class Exercise03 {

    public static void main(String[] args) {

        //create Arraylist name listValue
        ArrayList<Integer> listValue = new ArrayList<>();

        //call method noDulicate(listValue) and display(listValue)
        noDuplicate(listValue);
        display(listValue);
    }

    public static void noDuplicate(ArrayList<Integer> listValue){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value(enter 0 to dsiplay the result): ");

        //Ask user input the first number
        int number = scanner.nextInt();

        //keep user input the result when the number that user input not zero
        while(number != 0){
            if(!listValue.contains(number)){
                listValue.add(number);
            }

            number = scanner.nextInt();
        }

        scanner.close();
    }

    public static void display(ArrayList<Integer> listValue) {
        System.out.println("The list of value without duplicates are: ");
        for(int i=0; i<listValue.size(); i++){
            System.out.println(listValue.get(i));
        }
    }
}