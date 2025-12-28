//Q3]Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class Simple_interest_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Principle : ");
    double principle = sc.nextDouble();

    System.out.print("Enter the Rate : ");
    double rate = sc.nextDouble();

    System.out.print("Enter the Time in years : ");
    double time = sc.nextDouble();

    double si = (principle * rate * time ) / 100;

    System.out.println("Simple intrest for given time wil be : " + si);
    System.out.println("And amount will be : " +(principle + si ));

    sc.close();
  }  
}
