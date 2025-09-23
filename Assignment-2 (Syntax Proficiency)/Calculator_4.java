/*4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
import java.util.Scanner;
public class Calculator_4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the value of num2 :");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /) : ");
        String operator = sc.nextLine();
        double result;
        if(operator.equals("+")) {
            result = num1 + num2;
            System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
        }
        else if(operator.equals("-")) {
            result = num1 - num2;
            System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
        }
        else if(operator.equals("*")) {
            result = num1 * num2;               
            System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
        }
        else if(operator.equals("/")) {
            if(num2 != 0) {
                result = num1 / num2;
                System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
        sc.close();
    }
}

