import java.util.Arrays;

public class Array_Exercise5 {

  public static void main(String[] args) {
    // Declare Variable
    int locker = 456, player = 456, count = 0;
    // Use Array boolean
    boolean[] locked = new boolean[456];

    // use method fill to fill all element in array to false
    Arrays.fill(locked, false);
    // use for loop for first player, second player,...
    for (int i = 1; i <= player; i++) {
      for (int j = i; j <= locker; j += i) {
        // if locker close then open it
        if (locked[j - 1] == false) {
          locked[j - 1] = true;
          // if locker open then close it
        } else {
          locked[j - 1] = false;
        }
      }
    }
    // loop all element in locked array
    for (int i = 0; i < locked.length; i++) {
      if (locked[i] == true) {
        // ten number per line
        if (count % 10 == 0) {
          System.out.println("");
        }
        // print all open lockers
        System.out.print((i + 1) + " ");
        count++;
      }
    }
    // print total open lockers
    System.out.print("\ntotal: " + count);
  }
}
