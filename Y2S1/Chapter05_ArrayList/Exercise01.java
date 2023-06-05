import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {
    public static void removeInt(int number, ArrayList<Integer> arraylist){
        for(int i = 0; i<arraylist.size(); i++){
            if(arraylist.get(i) == number){
                arraylist.remove(i);
                i--;
            }
        }
    } 
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(
            Arrays.asList(1,2,3,1,4,5,1,3,1)
        );
        //display arraylist before removing the integer
        System.out.println(arrayList);

        removeInt(1, arrayList);
        //display arraylist after removing the integer
        System.out.println(arrayList);;
    }
}

