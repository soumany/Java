
import java.util.ArrayList;
import java.util.Random;

/*
    Name: SopheaOudom
    Class: M5
 */

/**
 * Arraylist04
 */
public class Exercise04 {

    public static void main(String[] args) {

        //Generate the random numbers
        ArrayList<Integer> listValue = randomlyNumbers();

        //display
        System.out.print("The random numbers are: ");
        for(int i=0; i<listValue.size(); i++){
            System.out.printf(listValue.get(i) + " ");
        }

        System.out.println();

        //finding the missing numbers
        ArrayList<Integer> missingValue = missingNumbers(listValue);

        //display
        System.out.print("The missing number(s) is/are: ");
        for(int i=0; i<missingValue.size(); i++){
            System.out.printf(missingValue.get(i) + " ");
        }
    }

    static ArrayList<Integer> randomlyNumbers(){

        //create Arraylist name listValue
        ArrayList<Integer> listValue = new ArrayList<>();
        Random rand = new Random();

        //generate the value
        for(int i=0; i<10; i++){
            int number = rand.nextInt(10)+1;
            listValue.add(number);
        }

        return listValue;
    }

    static ArrayList<Integer> missingNumbers(ArrayList<Integer> listValue){
        
        //create Arraylist name missing-value
        ArrayList<Integer> missingValue = new ArrayList<>();

        //loop to find the missing numbers
        for(int i=1; i<=10; i++){
            if(!listValue.contains(i)){
                missingValue.add(i);
            }
        }

        return missingValue;
    }
}