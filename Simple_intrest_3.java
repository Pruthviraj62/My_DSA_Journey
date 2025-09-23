/*3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest. */

import java .util.Scanner;
public class Simple_intrest_3 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount (P) : ");
        double P = sc.nextDouble();
        System.out.print("Enter the time in years (T) :");
        double T = sc.nextDouble();
        System.out.print("Enter the rate of interest (R) :");
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100;
        System.out.println("The Simple Interest is : " + SI);
        sc.close();


    }
    }