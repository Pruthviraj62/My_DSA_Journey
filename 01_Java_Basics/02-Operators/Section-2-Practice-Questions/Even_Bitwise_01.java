// Q.1] Check whether a number is even using bitwise operator.

import java.util.Scanner;
public class Even_Bitwise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("Number is Even....!");
        }else{
            System.out.println("Number is odd...!");
        }

         sc.close();
    }
   
}

            