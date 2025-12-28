//Q5]Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        double num1 = sc.nextInt();

        System.out.print("Enter the num2 : ");
        double num2 = sc.nextInt();

        if(num1 > num2 ){
            System.out.println(num1 + " is greater than " + num2);
        }else if(num1 == num2){
            System.out.println(num1 + " and " + num2  + " is equal.... ");
        }else{
            System.out.println(num2 + " is greater than " + num1);
        }

        sc.close();
    }
    
}
