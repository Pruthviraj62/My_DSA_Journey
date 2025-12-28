// Q6] Input currency in rupees and output in USD.
import java.util.Scanner;
public class Dollar_convertor_06 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the amount in Rupee : ");
    double rupee = sc.nextDouble();

    double dollar = rupee * 0.0111;

    System.out.println("Rupee to dollars are : " + dollar);

    sc.close();
}   
}
