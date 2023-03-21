import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02 {

    public static void removeDuplicates(ArrayList <Integer> list){
        //loop for Remove duplicates
        for(int i = 0; i < list.size() -1 ; i++){
            for(int j = i +1; j < list.size(); j++ ){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    j-- ;
                }
            }
        }
    }
    public static void main(String[] args) {
        //creating Integer type of arraylist
        ArrayList <Integer> list = new ArrayList<>(
            Arrays.asList(2,3,1,2,1,1,3,3,2,4,5,4,2,4)
        );
        System.out.println("Original List: " + list);
        removeDuplicates(list);
        System.out.println("List after remove all duplicate :" + list);
    }
}

