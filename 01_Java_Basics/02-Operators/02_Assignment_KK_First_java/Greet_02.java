// Q2] Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Greet_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name : ");
        String name = input.nextLine();

        System.out.println(" Welcome Dear " + name + " \n Very good morning too you...! \n Have a good day..!");

        input.close();

    }    
}
