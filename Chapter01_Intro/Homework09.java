public class Homework09 {
    public static void main(String[] args) {

        // Checking if Perfect_Number equal to 6 and less than 1000 or not
        for(short Perfect_Number = 6; Perfect_Number < 1000; Perfect_Number++){
            short sum = 0;

            // Checking Perfect_Number divide by 2 and it is true if loop above it is true as well
            for(short divisor = (short)(Perfect_Number / 2); divisor >= 1; divisor--){
                
                // checking Perfet_Number Modulous by division equal to 0 or not
                if(Perfect_Number % divisor == 0){

                    //sum = sum + divisor
                    sum += divisor;
                }
            }

            //checking if sum equal to perfect_number or not
            if(sum == Perfect_Number){

                //output the value
                System.out.println(Perfect_Number + " ");
            }
        }
    }
}
