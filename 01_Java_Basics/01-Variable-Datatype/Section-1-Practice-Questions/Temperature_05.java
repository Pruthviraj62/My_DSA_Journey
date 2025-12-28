//5.Convert temperature from Celsius to Fahrenheit.
import java.util.Scanner;
public class Temperature_05 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double temp_c;
        
        System.out.print("Enter Temprature in Celsius : " );
        temp_c = sc.nextDouble();

        double temp_f = (temp_c * 9/5) + 32;

        System.out.println("Temprature in celsius is : " + temp_c);
        System.out.println("Temprature in fahrenheit is : " + temp_f);

    }
}
