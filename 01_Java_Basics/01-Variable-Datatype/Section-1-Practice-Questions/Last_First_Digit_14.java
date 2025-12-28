//14.Print the last digit and first digit of a number.

import java.util.Scanner;
public class Last_First_Digit_14 {

    static void firstnum(int num){

        while(num >= 10){
            num /= 10;
        }
        System.out.println("firstnum is : " + num);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int lastnum = num % 10;

        System.out.println("lastnum is : " + lastnum);
        firstnum(num);
       
        sc.close();

    }
}
