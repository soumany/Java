public class Homework08 {
    public static void main(String[] args) {

        //declare variable 
        float sum = 0.0f;

        System.out.println("1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99: ");

        //checking value of n and value of sum
        for(float n = 1.0f; n <= 97.0f; n += 2){

            // sum = sum + n / (n + 2)
            sum += n / (n + 2);
        }

        //output og sum of series
        System.out.println("Sum of series are: " + sum);
    }
}
