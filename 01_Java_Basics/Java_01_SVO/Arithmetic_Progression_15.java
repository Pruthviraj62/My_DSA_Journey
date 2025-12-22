//15.Check if three numbers form an arithmetic progression.

import java.util.Scanner;
public class Arithmetic_Progression_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 , num2 , num3;
        
        System.out.print("Enter the num1 : ");
        num1 = sc.nextDouble();

        System.out.print("Enter the num2 : ");
        num2 = sc.nextDouble();

        System.out.print("Enter the num3 : ");
        num3 = sc.nextDouble();

        double diff1 = num2 - num1;
        double diff2 = num3 - num2;

        if(diff1 == diff2){
            System.out.println("Given numbers form and arithmetic progression with diffrence of : " + diff1);
        }else {
            System.out.println("Not form arithmetic progression...!");
        }

        sc.close();
    }
}
