import java.util.Scanner;
public class Array_Exercise10 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hexadecimal number: ");

    String hexnum = scanner.nextLine();
    scanner.close();
      
    //converting hex to decimal by passing base 16 
    int num = Integer.parseInt(hexnum,16);
      
    System.out.println("Hexadecimal to decimal: "+num);
  }
}