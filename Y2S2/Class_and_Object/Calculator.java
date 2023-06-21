import java.util.Scanner;

public class Calculator {
     double num1;
     char operator;
     double num2;
    
     //constructor 
    public Calculator(double num1, char operator, double num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }
    
    //Method
    public void add() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    public void subtract() {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    
    public void multiply() {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    
    public void divide() {
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
    
    public void power() {
        System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
    }
    
    public void modulo() {
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /, ^, %): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        

        //create new Object
        Calculator calculator = new Calculator(num1, operator, num2);
        
        switch (operator) {
            case '+':
                calculator.add();
                break;
            case '-':
                calculator.subtract();
                break;
            case '*':
                calculator.multiply();
                break;
            case '/':
                calculator.divide();
                break;
            case '^':
                calculator.power();
                break;
            case '%':
                calculator.modulo();
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
