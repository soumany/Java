public class Exercise01 {

    public static void main(String[] args) {
  
      for (int i = 2; i < 1200; i++) {
  
        if (displayTwinPrime(i) && displayTwinPrime(i + 2)) {
          System.out.printf("(%d, %d)\n", i, i + 2);
        }
      }
    }
  
    static boolean displayTwinPrime(long n) {
  
      if (n < 2)
        return false;
  
      for (int i = 2; i <= n / 2; i++) {
  
        if (n % i == 0)
          return false;
      }
      return true;
    }
  
 }