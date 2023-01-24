import java.util.Scanner;
public class Array_Exercise9 {
  public static void main(String[] args){
    Scanner input = new Scanner( System.in );

    System.out.print("Enter a decimal number : ");

    int num =input.nextInt();
    input.close();
        
    // calling method toHexString()
    String str = Integer.toHexString(num);
    
    System.out.println(" Decimal to hexadecimal: "+str);
  }
}
