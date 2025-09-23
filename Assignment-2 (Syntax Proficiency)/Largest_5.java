//5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest_5{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the num2 : ");
        double num2 = sc.nextDouble();
        
        if(num1 > num2){
            System.out.println(num1 + " is greater...!");
        }
        else{
            System.out.println(num2 + " is greater...!");
        }
    }
}