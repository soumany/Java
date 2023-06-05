public class Homework10 {
    public static void main(String[] args) {
        
        System.out.println("1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625)");

        //declare variables
        float summation = 0.0f;

        //checking Arguments
        for(float i = 1.0f; i <= 624; i++){

            //using Math Method to compute square
            summation += 1 / (Math.sqrt(i) + Math.sqrt(i+1));
            // summation = summation + 1 / (math.sqrt(i) + Math.sqrt(i+1))

        } 

        //output the summation:
        System.out.println("Summation: " + summation);
    }
}
