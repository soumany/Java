
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise05 {
  public static void main(String[] args) {
    // Create an arraylist named list using as list
    ArrayList<Integer> Mylist = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
  
    System.out.println("Before rotate: " + Mylist+"\n");

    rotateRight(Mylist);// call out the functions

    System.out.println("After Rotated: " + Mylist);
  }
  public static void rotateRight(ArrayList<Integer> list) {
    // Check if the arraylist can be rotated to the right by two slots
    if (list.size() <= 3) {
      System.out.println("There should be at least 3 or more number of elements to rotate.");
    }
    else{
      for(int i = 0; i < 2; i++){
        int lastIndex = list.remove(list.size() - 1);
        list.add(0, lastIndex);
      }
    }
  } 
}