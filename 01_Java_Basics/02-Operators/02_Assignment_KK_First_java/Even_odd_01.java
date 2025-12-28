// Q1] Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Even_odd_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even...");
        }else{
            System.out.println("number is odd....");
        }
    sc.close();
    }
    
}
