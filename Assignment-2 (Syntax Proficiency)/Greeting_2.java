/*2. Take name as input and print a greeting message for that particular name. */
import java.util.Scanner;
public class Greeting_2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        System.out.println("Good morning and have a Best day " + name + "!");
        sc.close();
    }
}
