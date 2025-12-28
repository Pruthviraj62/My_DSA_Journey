// Q2] Check if two numbers have the same sign (+/-) using XOR.
import java.util.Scanner;
public class Same_Sign_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Entert the Number 2 : ");
        int num2 = sc.nextInt();

        if((num1 ^ num2)>= 0){
            System.out.println("the sign is same...!");
        }else{
            System.out.println("The sign is diffrent...!");
        }

        sc.close();
    }
    
}
