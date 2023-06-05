import java.util.*;

public class Exercise07 {
    //Create Method call getIntersection
    public static ArrayList<Character> getIntersection(ArrayList<Character> arrayList1, ArrayList<Character> arrayList2) {
        
        // retainAll use to remove the element that do not have the same in each ArrayList
        arrayList1.retainAll(arrayList2);
        System.out.println("Array List after intersection: " + arrayList1);
        return arrayList1;
    }

    public static void main(String[] args) {
        
        // creating an Arraylist
        ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
    
        // random A-Z and add to arraylist
        for (int i = 0; i < 10; i++) {
 
          char ch1 = (char) ((int)(Math.random() * 26) + 'A');
          char ch2 = (char) ((int)(Math.random() * 26) + 'A');
          arrayList1.add(ch1);
          arrayList2.add(ch2);

        }
        // Display the Arraylist like .toString()
        System.out.println("List 1: " + arrayList1);
        System.out.println("List 2: " + arrayList2);
        // Call method
        getIntersection(arrayList1, arrayList2);
    }

   
}