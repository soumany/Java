public class Exercise09 {

    /*
        Name: Sophea Oudom (M5)
        Group = 7
     */
    public static void main(String[] args) {
        displayLargest(102,54,78,190,200);
    }

    public static void displayLargest(int... numbers){

        //checking the numbers size
        if(numbers.length == 0){
            System.out.println("Sorry, There no something to pass.");
            return;
        }

        // assigned the first elements
        int result = numbers[0];

        // using loop to find the largest number
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The largest number is: " + result);
    }
}
