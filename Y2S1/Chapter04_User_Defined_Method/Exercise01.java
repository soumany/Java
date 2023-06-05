public class Exercise01 {

   
    static boolean displayTwinPrime(int num) {
  
      if (num < 2)
        return false;
  
      for (int i = 2; i <= num / 2; i++) {
  
        if (num % i == 0)
          return false;
      }
      return true;
    }
    public static void main(String[] args) {
  
      for (int i = 2; i < 1200; i++) {
  
        if (displayTwinPrime(i) && displayTwinPrime(i + 2)) {
          System.out.printf("(%d, %d)\n", i, i + 2);
        }
      }
    }
  
  
 }