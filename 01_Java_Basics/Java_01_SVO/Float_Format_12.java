//12.Multiply two float numbers and format output to 2 decimals.
import java.util.Scanner;
 public class Float_Format_12 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the float value 1 : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the float value 2 : ");
        float num2 = sc.nextFloat();

        float result = num1 * num2 ;
        System.out.print("The result into formated form is : ");
        System.out.printf("%.2f",result);


    }
}
