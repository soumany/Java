public class Homework07 {
    public static void main(String[] args) {

        //declare variables
        byte Number_Counter = 0;
        
        // Check_Line use to check a new line
        boolean Check_Line;

        //checking Arguments
        for(int Number = 100; Number <= 200; Number++){

            Check_Line = false;

            if(Number % 5 == 0){ // Number modulous by 5 equal 0
                if(Number % 6 != 0){ // Number modulousby 6 not equal to 0
                    System.out.println(Number + " "); // output
                    Number_Counter++; // increse Number_counter

                    Check_Line = true; // each time i increment it, it's true
                }
            }
            if(Number % 6 == 0){ // Number modulous by 6 equal 0
                if(Number % 5 != 0){ // Number modulos by 5 not equal 0
                    System.out.println(Number + " "); // output
                    Number_Counter++; // increse Number_Counter by 1

                    Check_Line = true; // each time i increment it, it's true
                }
            }

            // checking if Number_Counter modulous by 10 equal to 0 and Check_Line is true or not
            if(Number_Counter % 10 == 0 && Check_Line){
                System.out.println(); // output
            }
        }
    }
}
