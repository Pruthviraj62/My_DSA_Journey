// Q4]ake in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Calculator_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num1 : ");
        double num1 = sc.nextInt();

         System.out.print("Enter the num2 : ");
        double num2 = sc.nextInt();

        
        System.out.print("Enter the operator(+ , - , / , *) : ");
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println("addition of num1 and num2 is : " + (num1 + num2));
        }

        if(operator == '-'){
            System.out.println("substraction of num1 and num2 : " + (num1 - num2));

        }

        if(operator == '*'){
            System.out.println("Multiplication of num1 and num2 : " + (num1 * num2));
        }

        if(operator == '/'){
            System.out.println("Division of num1 / num2 : " + (num1 / num2));
        }


        sc.close();

    }
    
}
