//7.Check whether a number is integer or decimal.
import java.util.Scanner;
public class NumberTypeCheck_07 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        double number = input.nextDouble();

        if(number % 1 == 0 ){
            System.out.println("Number is Integer....!");
        }
        else{
            System.out.println("Number is Decimal....!");
        }

    }
    
}
