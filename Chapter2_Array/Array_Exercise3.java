import java.text.Collator;
import java.util.Arrays;

public class Array_Exercise3 {
    public static void main(String[] args) {

        // declare variable of Arrays
        String[] Text = { "Canada", "Demark", "Brazil", "Australia" };

        // Decoration of output:
        System.out.println("Before unsorted of Arrays is: ");

        // we use Arrays to sorting and searching array
        // we use toString() to return a string that represetn in the array above.
        System.out.println(Arrays.toString(Text));

        // we use Arrays.sort to sort the whole element in the array
        // we use this to sort the element in the array in the insenstive order.
        Arrays.sort(Text, Collator.getInstance());

        // Decoration of output After sorted array
        System.out.println("After sorted of Arrays is: ");
        System.out.println(Arrays.toString(Text));
    }
}
